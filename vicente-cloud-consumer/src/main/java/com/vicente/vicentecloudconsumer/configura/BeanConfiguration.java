package com.vicente.vicentecloudconsumer.configura;

import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shiweisen
 * @since 2018-02-01
 */
@Configuration
public class BeanConfiguration {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(BeanConfiguration.class);


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }


}
