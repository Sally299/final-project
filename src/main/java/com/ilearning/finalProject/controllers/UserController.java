package com.ilearning.finalProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping
    public String getUsers(Model model) {
        model.addAttribute("something","this is ");
        return "index";
    }
}
