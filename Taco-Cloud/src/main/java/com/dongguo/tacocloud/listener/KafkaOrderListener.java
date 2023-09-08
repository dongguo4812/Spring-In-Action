package com.dongguo.tacocloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Administrator
 * @Date: 2023-09-08
 */
@Component
@Slf4j
public class KafkaOrderListener {
    @KafkaListener(topics = "order")
    public void handle(String message) {
        log.info("kafka receive message: " + message);
    }
}
