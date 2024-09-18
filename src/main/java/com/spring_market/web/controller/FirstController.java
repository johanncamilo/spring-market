package com.spring_market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class FirstController {

    @GetMapping("/saludo")
    public String salute() {
        return "sapee 💀";
    }
}