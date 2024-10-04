package com.example.name_service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NameController {
    @GetMapping("/name")
    public String getName() {
        return "Gabriel Alejandro Silva Lozada";
    }
}
