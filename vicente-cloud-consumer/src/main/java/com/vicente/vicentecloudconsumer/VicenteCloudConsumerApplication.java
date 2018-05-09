package com.vicente.vicentecloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@ComponentScan
public class VicenteCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudConsumerApplication.class, args);
	}
}
