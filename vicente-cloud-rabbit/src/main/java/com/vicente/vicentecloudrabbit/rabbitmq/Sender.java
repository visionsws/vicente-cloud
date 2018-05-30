package com.vicente.vicentecloudrabbit.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author shiweisen
 * @since 2018-05-29
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello "+ LocalDateTime.now().toString();
        System.out.println("Sender: "+context);
        this.amqpTemplate.convertAndSend("vicente.queue.order",context);
    }

}
