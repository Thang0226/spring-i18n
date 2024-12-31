package com.controller;

import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @Autowired
    private User user;

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("user", user);
        return "index";
    }
}
