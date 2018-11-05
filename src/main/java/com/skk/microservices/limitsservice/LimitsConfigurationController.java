package com.skk.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skk.microservices.limitsservice.bean.LimtConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimtConfiguration retriveLimitsFromConfigurations() {
		return new LimtConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
