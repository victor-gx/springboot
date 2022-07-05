package com.gx.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class Hello {

    @RequestMapping("/hello")
    public String handle01(){

        return "Hello, Spring Boot 2!";
    }

}
