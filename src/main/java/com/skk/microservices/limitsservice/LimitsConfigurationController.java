package com.skk.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.skk.microservices.limitsservice.bean.LimtConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimtConfiguration retriveLimitsFromConfigurations() {
		return new LimtConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
	@GetMapping("/hystrix")
	@HystrixCommand(fallbackMethod="fallback")
	public LimtConfiguration retriveConfigurations() {
		throw new RuntimeException("This service is not available");
	}
	
	public LimtConfiguration fallback() {
		return new LimtConfiguration(10, 10);
	}
}
