package com.itheima.rabbitmq.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class SendMessage {

    @RabbitListener(queues=RabbitMQConfig.QUEUE_NAME)
    public void aa(Message message){

    }
}
