package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class UserController {

    @GetMapping("/login")
    public String loginPage(){
        System.out.println("Into login function...");
        return "login";
    }
}
