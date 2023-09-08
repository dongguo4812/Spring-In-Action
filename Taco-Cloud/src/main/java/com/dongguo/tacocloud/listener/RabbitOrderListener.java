package com.dongguo.tacocloud.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitOrderListener {
    @RabbitListener(queues = "order")
    public void receive(String msg) {
        log.info("order receive message: "+msg);
    }
}
