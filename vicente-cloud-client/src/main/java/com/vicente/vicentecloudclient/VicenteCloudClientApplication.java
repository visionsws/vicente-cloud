package com.vicente.vicentecloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class VicenteCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudClientApplication.class, args);
	}
}
