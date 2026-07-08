package com.example.Google_API.service;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.FileContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

@Service
public class GoogleService {

    private static final String APPLICATION_NAME = "DriveUploader";

    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    private static final List<String> SCOPES =
            Collections.singletonList(DriveScopes.DRIVE_FILE);

    // Make sure this file exists in src/main/resources
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    @Value("${google.drive.folder-id}")
    private String folderId;

    private Drive getDriveService() throws Exception {

        InputStream in = getClass().getResourceAsStream(CREDENTIALS_FILE_PATH);

        if (in == null) {
            throw new RuntimeException("credentials.json not found inside src/main/resources");
        }

        GoogleClientSecrets clientSecrets =
                GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        GoogleAuthorizationCodeFlow flow =
                new GoogleAuthorizationCodeFlow.Builder(
                        GoogleNetHttpTransport.newTrustedTransport(),
                        JSON_FACTORY,
                        clientSecrets,
                        SCOPES)
                        .setDataStoreFactory(new FileDataStoreFactory(new java.io.File("tokens")))
                        .setAccessType("offline")
                        .build();

        Credential credential =
                new AuthorizationCodeInstalledApp(
                        flow,
                        new LocalServerReceiver.Builder()
                                .setPort(8888)
                                .build())
                        .authorize("user");

        return new Drive.Builder(
                GoogleNetHttpTransport.newTrustedTransport(),
                JSON_FACTORY,
                credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public String uploadFile(MultipartFile multipartFile) throws Exception {

        File fileMetadata = new File();
        fileMetadata.setName(multipartFile.getOriginalFilename());

        // Upload into your Google Drive folder
        fileMetadata.setParents(Collections.singletonList(folderId));

        java.io.File file = convert(multipartFile);

        FileContent mediaContent =
                new FileContent(multipartFile.getContentType(), file);

        File uploadedFile = getDriveService()
                .files()
                .create(fileMetadata, mediaContent)
                .setFields("id,webViewLink")
                .execute();

        return uploadedFile.getWebViewLink();
    }

    private java.io.File convert(MultipartFile multipartFile) throws IOException {

        java.io.File convFile = new java.io.File(
                System.getProperty("java.io.tmpdir")
                        + "/"
                        + multipartFile.getOriginalFilename());

        try (FileOutputStream fos = new FileOutputStream(convFile)) {
            fos.write(multipartFile.getBytes());
        }

        return convFile;
    }
}