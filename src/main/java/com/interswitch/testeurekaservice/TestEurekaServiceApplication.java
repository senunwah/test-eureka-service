package com.interswitch.testeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TestEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEurekaServiceApplication.class, args);
	}

}

