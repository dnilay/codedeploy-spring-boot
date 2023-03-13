package com.example.demoprojectcodedeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/health")
    public ResponseEntity<?> healthCheck()
    {
        return ResponseEntity.ok("it worked successfully...");
    }

    @GetMapping("/api/hello/{name}")
    public ResponseEntity<?> sayHello(@PathVariable("name") String name)
    {
        return ResponseEntity.ok("Hello "+name);
    }
}
