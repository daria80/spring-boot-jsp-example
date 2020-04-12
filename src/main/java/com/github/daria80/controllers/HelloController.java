package com.github.daria80.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping({"/","/hello"})
    public String index() {
        return "home";
    }
}
