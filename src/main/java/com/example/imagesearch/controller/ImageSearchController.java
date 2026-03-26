package com.example.imagesearch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageSearchController {

    @GetMapping("/search")
    public String searchImages(@RequestParam String query) {
        // Logic to search images
        return "Searching for images with query: " + query;
    }
}