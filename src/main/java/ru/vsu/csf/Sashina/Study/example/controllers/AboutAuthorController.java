package ru.vsu.csf.Sashina.Study.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutAuthorController {
    @GetMapping("/about-author")
    public String aboutAuthor(Model model) {
        return "about-author";
    }
}
