package com.nf147.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @RequestMapping("/cart")
    public String cart(){
        return "cart";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
