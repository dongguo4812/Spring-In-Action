package com.dongguo.tacocloud.listener;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @JmsListener(destination = "order.queue")
    public void recieveMessage(String message) {
        System.out.println("服务订阅接收消息： " + message);
    }
}
