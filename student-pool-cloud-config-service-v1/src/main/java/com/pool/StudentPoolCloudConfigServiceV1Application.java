package com.pool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StudentPoolCloudConfigServiceV1Application {

	public static void main(String[] args) {
		SpringApplication.run(StudentPoolCloudConfigServiceV1Application.class, args);
	}

}
