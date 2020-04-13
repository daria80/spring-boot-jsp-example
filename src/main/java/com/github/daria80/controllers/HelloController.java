package com.github.daria80.controllers;

import com.github.daria80.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HelloController {

    private ArrayList<Book> books = new ArrayList<>();

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/books")
    public String addBook(Model model, @RequestParam(required = false) String name) {
        if (name != null) books.add(new Book(name));
        model.addAttribute("books", books);
        return "books";
    }
}


