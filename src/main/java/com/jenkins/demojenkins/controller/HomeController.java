package com.jenkins.demojenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/home")
public class HomeController {

    @GetMapping(path="/helloworld")
    public String home(){
        return "hello world!!";
    }
}
