package com.vicente.vicentecloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VicenteCloudConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudConsumerApplication.class, args);
	}
}
