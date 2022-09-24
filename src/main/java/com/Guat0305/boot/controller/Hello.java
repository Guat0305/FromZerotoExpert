package com.Guat0305.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/FromZeroToExpert")
    public String hello() {
        return "<h1>嗨，欢迎您来到 from zero to expert.<h1/>";
    }

}
