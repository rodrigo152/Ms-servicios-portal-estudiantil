package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class MsAdminRegistryServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsAdminRegistryServer1Application.class, args);
	}

}
