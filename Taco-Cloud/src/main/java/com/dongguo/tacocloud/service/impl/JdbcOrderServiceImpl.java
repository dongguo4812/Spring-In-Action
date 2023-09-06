package com.dongguo.tacocloud.service.impl;

import com.dongguo.tacocloud.entity.Ingredient;
import com.dongguo.tacocloud.entity.TacoOrder;
import com.dongguo.tacocloud.service.JdbcOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2023-09-06
 */
@Service
public class JdbcOrderServiceImpl implements JdbcOrderService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Ingredient> list() {
        String sql = "select * from ingredient";
        List<Ingredient> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Ingredient.class));

        return list;
    }
}
