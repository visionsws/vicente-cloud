package com.vicente.vicentecloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VicenteCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudConfigServerApplication.class, args);
	}
}
