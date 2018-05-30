package com.vicente.vicentecloudrabbit.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author shiweisen
 * @since 2018-05-29
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("vicente.queue.order");
    }
}
