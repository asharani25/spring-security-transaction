package com.banking.app.withspringsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "Authorized to access home page";
    }

    @GetMapping("/admin")
    public String admin(){
        return "Authorized to access Admin page";
    }
}
