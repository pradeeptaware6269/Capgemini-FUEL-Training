package com.example.Spring_E_Com.config;

import com.example.Spring_E_Com.security.CustomUserDetailsService;
import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;

import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.springframework.security.web.SecurityFilterChain;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;


@RequiredArgsConstructor
@Configuration
public class SecurityConfig {


    // Password Encoder
    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();

    }


    // Security Filter Chain
    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http
    ) throws Exception {


        http

                // Disable CSRF for REST API
                .csrf(csrf -> csrf.disable())


                // Enable CORS
                .cors(cors->{})


                // Stateless Session
                .sessionManagement(session ->
                        session.sessionCreationPolicy(
                                SessionCreationPolicy.STATELESS
                        )
                )


                // Authorization
                .authorizeHttpRequests(auth -> auth

                        // Public APIs
                        .requestMatchers(
                                "/",
                                "/api/auth/**",
                                "/v3/api-docs/**",
                                "/swagger-ui/**",
                                "/swagger-ui.html",
                                "/product/**"
                        ).permitAll()


                        // For development
                        .anyRequest().permitAll()

                );


        return http.build();

    }


    // CORS Configuration
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {

        CorsConfiguration configuration =
                new CorsConfiguration();


        // React frontend URL
        configuration.setAllowedOrigins(
                List.of(
                        "http://localhost:5173"
                )
        );


        // Allowed HTTP Methods
        configuration.setAllowedMethods(
                List.of(
                        "GET",
                        "POST",
                        "PUT",
                        "DELETE",
                        "PATCH",
                        "OPTIONS"
                )
        );


        // Allowed Headers
        configuration.setAllowedHeaders(
                List.of("*")
        );


        // Allow credentials
        configuration.setAllowCredentials(true);


        // Apply CORS configuration
        UrlBasedCorsConfigurationSource source =
                new UrlBasedCorsConfigurationSource();


        source.registerCorsConfiguration(
                "/**",
                configuration
        );


        return source;

    }


    // Authentication Provider
    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider(
            CustomUserDetailsService customUserDetailsService
    ) {

        DaoAuthenticationProvider provider =
                new DaoAuthenticationProvider(
                        customUserDetailsService
                );


        provider.setPasswordEncoder(
                passwordEncoder()
        );


        return provider;

    }


    // Authentication Manager
    @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authenticationConfiguration
    ) throws Exception {

        return authenticationConfiguration
                .getAuthenticationManager();

    }

}