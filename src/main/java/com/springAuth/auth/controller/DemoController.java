package com.springAuth.auth.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello World");
    }


    @GetMapping("/adminonly")
    public ResponseEntity<String> adminOnly() {
        return ResponseEntity.ok("Admin only");
    }
}
