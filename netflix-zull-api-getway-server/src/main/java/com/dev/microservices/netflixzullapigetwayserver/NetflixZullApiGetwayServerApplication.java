package com.dev.microservices.netflixzullapigetwayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZullApiGetwayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixZullApiGetwayServerApplication.class, args);
	}

	@Bean
	public Sampler defaultSample() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
