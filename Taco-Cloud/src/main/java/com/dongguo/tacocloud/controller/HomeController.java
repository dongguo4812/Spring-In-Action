package com.dongguo.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Administrator
 * @Date: 2023-09-05
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
