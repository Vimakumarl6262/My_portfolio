package com.example.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index"; // loads index.html from templates
    }

    @GetMapping("/resume")
    public String downloadResume() {
        return "redirect:/resume.pdf";
    }
}