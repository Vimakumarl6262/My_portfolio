package com.example.portfolio.controller;

import com.example.portfolio.model.*;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return List.of(
            new Project("Portfolio Website", "HTML, CSS, JS", "Personal portfolio site", "#"),
            new Project("Task Manager", "Java, Spring Boot", "Task management app", "#"),
            new Project("E-commerce Platform", "Spring Boot, JS", "Online shopping", "#")
        );
    }

    @GetMapping("/skills")
    public List<Skill> getSkills() {
        return List.of(
            new Skill("Java", 90),
            new Skill("Spring Boot", 85),
            new Skill("HTML/CSS", 80)
        );
    }
}
