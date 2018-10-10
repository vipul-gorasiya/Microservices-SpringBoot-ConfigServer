package com.vipul.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@Value("${greeting}")
	private String greeting;
	
	@RequestMapping("/greeting")
	public String greeting(){
		return this.greeting;
	}

}
