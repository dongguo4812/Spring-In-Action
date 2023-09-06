package com.dongguo.tacocloud.controller;


import com.dongguo.tacocloud.entity.Ingredient;
import com.dongguo.tacocloud.entity.Ingredient.Type;
import com.dongguo.tacocloud.entity.Taco;
import com.dongguo.tacocloud.entity.TacoOrder;
import com.dongguo.tacocloud.service.JdbcOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 */
@Tag(name = "构建管理")
@RestController
@RequestMapping("/design")
@Slf4j
public class DesignTacoController {
    @GetMapping("/")
    public String showDesignForm(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient(1L, "Flour Tortilla", Type.WRAP),
                new Ingredient(2L, "Corn Tortilla", Type.WRAP),
                new Ingredient(3L, "Ground Beef", Type.PROTEIN),
                new Ingredient(4L, "Carnitas", Type.PROTEIN),
                new Ingredient(5L, "Diced Tomatoes", Type.VEGGIES),
                new Ingredient(6L, "Lettuce", Type.VEGGIES),
                new Ingredient(7L, "Cheddar", Type.CHEESE),
                new Ingredient(8L, "Monterrey Jack", Type.CHEESE),
                new Ingredient(9L, "Salsa", Type.SAUCE),
                new Ingredient(10L, "Sour Cream", Type.SAUCE)
        );
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
        return "design";
    }
    private Iterable<Ingredient> filterByType(
            List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }

    @PostMapping("/add")
    public String processTaco(Taco taco, TacoOrder tacoOrder) {
        tacoOrder.addTaco(taco);
        log.info("Processing taco: {}", taco);
        return "redirect:/orders/current";
    }

    @Autowired
    private JdbcOrderService jdbcOrderService;

    @PostMapping("/list")
    @Operation(summary = "列表")
    public List<Ingredient> list() {
        return jdbcOrderService.list();
    }


    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @PostMapping("/redis")
    @Operation(summary = "缓存数据")
    public String redis() {
        return stringRedisTemplate.opsForValue().get("10");
    }
}
