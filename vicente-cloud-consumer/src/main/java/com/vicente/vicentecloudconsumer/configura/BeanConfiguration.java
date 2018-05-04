package com.vicente.vicentecloudconsumer.configura;

import org.slf4j.LoggerFactory;
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
    public RestTemplate getRestTemplate() {
        return new RestTemplate();

    }


}
