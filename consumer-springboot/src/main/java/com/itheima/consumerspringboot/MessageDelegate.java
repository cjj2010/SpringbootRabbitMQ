package com.itheima.consumerspringboot;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.messaging.handler.annotation.Payload;

public class MessageDelegate {
    private final static transient Logger log = LoggerFactory.getLogger(MessageDelegate.class);
    public void method1(@Payload String message) {
        log.info("method1收到的消息：" + new String(message));
//        channel.basicAck(false);
    }

    public void method2(String messageBody) {
        log.info("method2收到的消息：" + messageBody);
    }
}