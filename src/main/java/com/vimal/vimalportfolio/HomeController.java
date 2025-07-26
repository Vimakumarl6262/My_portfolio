// src/main/java/com/vimal/vimalportfolio/controller/HomeController.java
package com.vimal.vimalportfolio; // Make sure 'controller' package exists

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // This marks it as a Spring MVC controller
public class HomeController {

    @GetMapping("/") // This maps HTTP GET requests to the root URL ("/")
    public String home() {
        // This tells Spring Boot to look for a template named "index"
        // in src/main/resources/templates/ and render it using Thymeleaf.
        return "index";
    }
}