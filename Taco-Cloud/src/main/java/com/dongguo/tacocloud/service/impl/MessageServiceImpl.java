//package com.dongguo.tacocloud.service.impl;
//
//import com.dongguo.tacocloud.service.MessageService;
//import jakarta.jms.JMSException;
//import jakarta.jms.Message;
//import jakarta.jms.Session;
//import jakarta.jms.TextMessage;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.jms.core.MessageCreator;
//import org.springframework.stereotype.Service;
//
///**
// * @Author: Administrator
// * @Date: 2023-09-07
// */
//@Service
//@Slf4j
//public class MessageServiceImpl implements MessageService {
//    @Autowired
//    private JmsTemplate jmsTemplate;
//
//
//    @Override
//    public void sendOrder() {
//        jmsTemplate.send("order.queue", new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                // 也可以创建对象 session.createObjectMessage()
//                TextMessage textMessage = session.createTextMessage();
//                textMessage.setText("hello");
//                return textMessage;
//            }
//        });
//        log.info("message send success");
//    }
//}
