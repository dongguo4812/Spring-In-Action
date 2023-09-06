package com.dongguo.tacocloud.service;

import com.dongguo.tacocloud.entity.Ingredient;
import com.dongguo.tacocloud.entity.TacoOrder;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 */
public interface JdbcOrderService {
    List<Ingredient> list();
}
