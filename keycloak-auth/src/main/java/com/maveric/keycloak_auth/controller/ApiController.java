package com.maveric.keycloak_auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/internal")
    public ResponseEntity<String> internalEndpoint() {
        return ResponseEntity.ok("This is an internal endpoint, accessible by Admin role.");
    }

    @GetMapping("/external")
    public ResponseEntity<String> externalEndpoint() {
        return ResponseEntity.ok("This is an external endpoint, accessible by User role.");
    }

    @GetMapping("/public")
    public ResponseEntity<String> publicEndpoint() {
        return ResponseEntity.ok("This is a public endpoint, accessible by anyone.");
    }
}

