package com.vicente.vicentecloudzuul.config;

import com.vicente.vicentecloudzuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfig {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }
}
