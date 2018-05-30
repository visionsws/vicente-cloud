package com.vicente.vicentecloudrabbit.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author shiweisen
 * @since 2018-05-29
 */
@Component
@RabbitListener(queues = "vicente.queue.order")
public class Receiver {

    @RabbitHandler
    public void process(String hello){
        System.out.println("Receiver: "+hello);
    }
}
