package com.vicente.vicentecloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VicenteCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudServerApplication.class, args);
	}
}
