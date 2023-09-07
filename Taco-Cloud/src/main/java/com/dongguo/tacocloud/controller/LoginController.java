package com.dongguo.tacocloud.controller;

import com.dongguo.tacocloud.entity.MyCollection;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Administrator
 * @Date: 2023-09-07
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String login() {
        return "login";
    }
}
