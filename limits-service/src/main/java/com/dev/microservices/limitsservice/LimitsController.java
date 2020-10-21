package com.dev.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.microservices.limitsservice.bean.Configuration;
import com.dev.microservices.limitsservice.bean.LimtisConfig;

@RestController
public class LimitsController {
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimtisConfig getLimitsFrom() {
		return new LimtisConfig(configuration.getMaximum(),configuration.getMinimum());
	}

}
