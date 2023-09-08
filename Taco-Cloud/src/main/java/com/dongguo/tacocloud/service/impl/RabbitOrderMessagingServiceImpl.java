package com.dongguo.tacocloud.service.impl;

import com.dongguo.tacocloud.service.RabbitOrderMessagingService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Administrator
 * @Date: 2023-09-08
 */
@Service
public class RabbitOrderMessagingServiceImpl implements RabbitOrderMessagingService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Override
    public void sendOrder() {
        rabbitTemplate.convertAndSend("order", "hello");
    }
}
