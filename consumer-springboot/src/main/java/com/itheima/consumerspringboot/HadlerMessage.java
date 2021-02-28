package com.itheima.consumerspringboot;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Configuration
public class HadlerMessage {
//    @Bean
//    public SimpleMessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory) {
//        SimpleMessageListenerContainer messageListenerContainer = new SimpleMessageListenerContainer(connectionFactory);
//        messageListenerContainer.setQueueNames("machine2_0010119140000460","machine2_0010119140000460");
//        messageListenerContainer.setConcurrentConsumers(3);
//        messageListenerContainer.setMaxConcurrentConsumers(5);
//        messageListenerContainer.setAcknowledgeMode(AcknowledgeMode.MANUAL);
//        messageListenerContainer.setConsumerTagStrategy(queue -> queue + "_" + UUID.randomUUID().toString());
//
//        messageListenerContainer.setPrefetchCount(1);
//        MessageListenerAdapter listenerAdapter = new MessageListenerAdapter(new MessageDelegate());
////        listenerAdapter.setMessageConverter(new Jackson2JsonMessageConverter());
////        listenerAdapter.onMessage();
//        Map<String,String> queueOrTagToMethod=new HashMap<>();
//        queueOrTagToMethod.put("machine2_0010119140000460","method1");
//        queueOrTagToMethod.put("machine2_0010119140000460","method2");
//        listenerAdapter.setQueueOrTagToMethodName(queueOrTagToMethod);
//        listenerAdapter.onMessage();
//        messageListenerContainer.setMessageListener(listenerAdapter);
//        return messageListenerContainer;   }

}
