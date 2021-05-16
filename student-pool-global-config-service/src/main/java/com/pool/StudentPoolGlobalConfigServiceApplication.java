package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class StudentPoolGlobalConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolGlobalConfigServiceApplication.class, args);
	}

}
