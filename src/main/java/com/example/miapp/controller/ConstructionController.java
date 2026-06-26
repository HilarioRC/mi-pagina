package com.example.miapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConstructionController {

    @GetMapping("/en-construccion")
    public String construction() {
        return "construction";
    }
}
