package com.dongguo.tacocloud.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: Administrator
 * @Date: 2023-09-05
 */

@Tag(name = "主页管理")
@Controller
public class HomeController {
    @Operation(summary = "主页")
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
