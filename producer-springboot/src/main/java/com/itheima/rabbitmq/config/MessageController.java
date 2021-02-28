package com.itheima.rabbitmq.config;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MessageController {
    @Autowired
    public  RabbitTemplate rabbitTemplate;
    @RequestMapping(value = "/sendMessage",method = RequestMethod.GET)
    public String hh() {
        String aa="demo";
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME,"boot.xxc",aa,correlationData);
        return "super.toString()";
    }
}
