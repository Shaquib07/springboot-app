package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/api")
public class UserController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
