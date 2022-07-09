package com.gx.boot.controller;

import com.gx.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

//@ResponseBody
//@Controller

@Slf4j
@RestController
public class Hello {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        log.info("place ...");
        return "Hello, Spring Boot 2!";
    }

}
