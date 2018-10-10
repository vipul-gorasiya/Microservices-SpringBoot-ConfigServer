package com.vipul.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
// To enable refresh of config properties being accessed from config server
@RefreshScope
public class SpringMsConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMsConfigClientApplication.class, args);
	}
}
