package com.dongguo.tacocloud.entity;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 * taco配料表
 */
@Data
public class Ingredient {
    private Long id;
    private String name;
    private String type;
}
