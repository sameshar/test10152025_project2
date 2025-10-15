package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserInfoController {

    @GetMapping("/")
    public String showForm() {
        return "userform";
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String location,
            Model model) {
        
        // Print to console
        System.out.println("\nUser Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Location: " + location);

        // Add to model for display in view
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("location", location);
        model.addAttribute("submitted", true);

        return "userform";
    }
}