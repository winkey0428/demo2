package com.example.demo2.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("world")
    public String hello_world(){
        //远程更改
        return  "hello_world";
    }
}
