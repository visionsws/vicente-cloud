package com.vicente.vicentecloudzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class VicenteCloudZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(VicenteCloudZuulApplication.class, args);
	}
}
