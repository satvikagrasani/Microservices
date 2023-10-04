package com.mindcraft.servicediscoverydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer // this makes application as service discovery
@SpringBootApplication
public class ServicediscoverydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicediscoverydemoApplication.class, args);
		
	}

}
