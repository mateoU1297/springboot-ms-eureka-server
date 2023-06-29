package com.springboot.app.mseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMsEurekaServerApplication.class, args);
	}

}
