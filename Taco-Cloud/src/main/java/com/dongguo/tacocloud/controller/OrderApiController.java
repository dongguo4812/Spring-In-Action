package com.dongguo.tacocloud.controller;

import com.dongguo.tacocloud.service.MessageService;
import com.dongguo.tacocloud.service.RabbitOrderMessagingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Date: 2023-09-07
 */
@Tag(name = "订单管理")
@RestController
@RequestMapping("/order")
public class OrderApiController {

//    @Autowired
//    private MessageService messageService;
    @Autowired
    private RabbitOrderMessagingService rabbitOrderMessagingService;
//    @Operation(summary = "发送消息")
//    @PostMapping("/sendMessage")
//    public void postOrder() {
//        messageService.sendOrder();
//    }

    @PostMapping("/sendMQMessage")
    public String sendMQMessage() {
        rabbitOrderMessagingService.sendOrder();
        return "ok";
    }

}
