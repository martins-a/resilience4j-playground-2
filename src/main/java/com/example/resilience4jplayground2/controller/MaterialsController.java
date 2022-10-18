package com.example.resilience4jplayground2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materials")
public class MaterialsController {

    @GetMapping
    public Boolean checkMaterials() {
        return true;
    }

}
