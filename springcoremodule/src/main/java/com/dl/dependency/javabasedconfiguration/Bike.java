package com.dl.dependency.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("bike")
@Configuration
@ComponentScan(basePackages="com.dl.dependency.annotations")
public class Bike implements Brand {

	@Override
	@Bean
	public String BMW() {
		
		return "BMW S 1000 XR,BMW G 310 GS";
	}

}
