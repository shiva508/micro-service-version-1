package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentPoolPlanV1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolPlanV1Application.class, args);
	}

}
