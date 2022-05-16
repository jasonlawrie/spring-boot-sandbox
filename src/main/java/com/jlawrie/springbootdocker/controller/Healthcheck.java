package com.jlawrie.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Healthcheck {
    @RequestMapping("/")
    public String healthcheck() {
        return "Success";
    }
}
