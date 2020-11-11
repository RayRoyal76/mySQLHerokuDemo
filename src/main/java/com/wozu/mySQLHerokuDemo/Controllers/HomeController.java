package com.wozu.mySQLHerokuDemo.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome To My Dog Home Page";
    }
}
