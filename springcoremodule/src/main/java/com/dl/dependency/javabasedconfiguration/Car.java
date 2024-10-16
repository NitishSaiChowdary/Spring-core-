package com.dl.dependency.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component("car")
@Configuration
@ComponentScan(basePackages="com.dl.dependency.annotations")
public class Car implements Brand {

	@Override
	@Bean
	public String BMW() {
		
		return "BMW X6,BMW M5 ";
	}

}
