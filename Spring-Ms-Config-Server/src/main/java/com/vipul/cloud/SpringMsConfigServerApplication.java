package com.vipul.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsConfigServerApplication.class, args);
	}
}