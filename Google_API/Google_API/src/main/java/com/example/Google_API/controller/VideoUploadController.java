package com.example.Google_API.controller;
import com.example.Google_API.service.GoogleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/google-driver/upload")
public class VideoUploadController {

    @Autowired
    private GoogleService googleService;
    @PostMapping("/upload")
    public ResponseEntity<String> uploadVideo(
            @RequestParam("file") MultipartFile file) {

        System.out.println("Controller Called");
        System.out.println(file.getOriginalFilename());

        try {
            String link = googleService.uploadFile(file);
            return ResponseEntity.ok("Video Uploaded Successfully!\n" + link);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Upload Failed : " + e.getMessage());
        }

    }
}