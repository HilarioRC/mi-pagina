package com.example.miapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/sobre-mi")
    public String about() {
        return "about";
    }
}
