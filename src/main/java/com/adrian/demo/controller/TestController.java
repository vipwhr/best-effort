package com.adrian.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String test(String name){
        return "Hello~ " + name;
    }

}
