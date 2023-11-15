package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping ("/hello")
    public String hello() {
        return "hello springboot and i love you muqian";
    }

    @Autowired
    private Environment env;

    @RequestMapping("/s")
    public void s() {
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("address[0]"));
    }
}
