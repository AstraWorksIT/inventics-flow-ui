package com.astraworks.inventicsflowui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String getHomePage(Model model){
        model.addAttribute("message", "Hello Guys");

        return "index";
    }
}
