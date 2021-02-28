package com.itheima.consumerspringboot;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class RabbimtMQListener {
    @Autowired
    private ServerConfig serverConfig;
    @RabbitListener(queues = "machine2_0010119140000460")
    public void ListenerQueue(Message message, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException, InterruptedException {
        //System.out.println(message);

        channel.basicQos(0, 1, false);
        //使用限流必须设置ack手动签收
        Thread.sleep(10000);
        channel.basicAck(deliveryTag,false);
    }
//    @RabbitListener(queues = "machine2_0010119140000460")
//    public void ListenerQueue1(Message message, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException {
//        //System.out.println(message);
//        System.out.println(new String(message.getBody())+"我是2");
//        channel.basicQos(0, 1, false);
//        //使用限流必须设置ack手动签收
//        channel.basicAck(deliveryTag,false);
//    }


}
