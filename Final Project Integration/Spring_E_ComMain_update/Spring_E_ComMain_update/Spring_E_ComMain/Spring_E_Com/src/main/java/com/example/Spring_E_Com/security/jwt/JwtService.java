package com.example.Spring_E_Com.security.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.io.Decoders;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class JwtService {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${jwt.expiration}")
    private Long jwtExpiration;

    private Key key;

//    @PostConstruct
//    public void init() {
//        byte[] keyBytes = Decoders.BASE64.decode(jwtSecret);
//        this.key = Keys.hmacShaKeyFor(keyBytes);
//    }


    public String generateToken(UserDetails userDetails) {

        return buildToken(
                new HashMap<>(),
                userDetails
        );
    }

    public String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails) {

        return buildToken(
                extraClaims,
                userDetails
        );
    }

    private String buildToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails) {

        return Jwts.builder()
                .claims(extraClaims)
                .subject(userDetails.getUsername())
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + jwtExpiration))
                .signWith(getSignInKey())
                .compact();
    }


    public String extractUsername(String token) {

        return extractClaim(
                token,
                Claims::getSubject
        );

    }


    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    public <T> T extractClaim(String token,
                              Function<Claims, T> claimsResolver) {

        Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }


    public boolean isTokenValid(String token,
                                UserDetails userDetails) {

        String username = extractUsername(token);

        return username.equals(userDetails.getUsername())
                && !isTokenExpired(token);
    }


    public boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }


    private Claims extractAllClaims(String token) {

        return Jwts.parser()
                .verifyWith((javax.crypto.SecretKey) key)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }



    // Helper method
    private SecretKey getSignInKey()
    {
        byte[] keyBytes=Decoders.BASE64.decode(jwtSecret);
        return Keys.hmacShaKeyFor(keyBytes);
    }


}