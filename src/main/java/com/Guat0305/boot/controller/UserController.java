package com.Guat0305.boot.controller;

import com.Guat0305.boot.pojo.User;
import com.Guat0305.boot.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author Yx_Gg
 */
@Log4j2
@Controller
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping("/FromZeroToExpert/register.html")
    public String registerPage() {
        return "redirect:/register.html";
    }


    @PostMapping("/FromZeroToExpert/Register")
    public String registerUser(User user) {
        if(user == null) {
            return "forward:/fail";
        }
        if(userService.findUserbyName(user.getUsername()) == null) {
            int flag = userService.insertUser(user);
            if(flag == 0) {
                log.info("insert 出错");
                return "forward:/fail";
            }else{
                log.info("注册成功");
                return "redirect:/FromZeroToExpert";
            }
        }else {
            log.info("该用户已存在");
            return "forward:/fail";
        }
    }

    @ResponseBody
    @RequestMapping("/fail")
    public String fail() {
        return "fail";
    }
}
