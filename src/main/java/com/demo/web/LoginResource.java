package com.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginResource {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
