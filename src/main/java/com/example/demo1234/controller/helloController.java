package com.example.demo1234.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yu
 * @Date 2023-02-09 23:49
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
}
