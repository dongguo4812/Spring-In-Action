package com.dongguo.tacocloud.service.impl;

import com.dongguo.tacocloud.service.KafkaMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: Administrator
 * @Date: 2023-09-08
 */
@Service
@Slf4j
public class KafkaMessageServiceImpl implements KafkaMessageService {
    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    @Override
    public void sendOrder() {
        kafkaTemplate.send("order", "hello");
    }
}
