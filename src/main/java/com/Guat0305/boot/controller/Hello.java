package com.Guat0305.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Hello {

    @RequestMapping("/FromZeroToExpert")
    public String hello(HttpServletResponse response, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            Cookie cookie = new Cookie("login" , "firstLogin");
            cookie.setMaxAge(86400);
            response.addCookie(cookie);
            return "<h1>嗨，欢迎您来到 from zero to expert.</h1>";
        }else {
            for(Cookie cookie : cookies) {
                if(cookie.getName().equals("login") && cookie.getValue().equals("firstLogin")) {
                    return "<h1>嗨，欢迎您再次到 from zero to expert.</h1>";
                }
            }
            return "<h1>WRONG</h1>";
        }

    }

}
