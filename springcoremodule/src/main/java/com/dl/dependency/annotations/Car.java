package com.dl.dependency.annotations;

import org.springframework.stereotype.Component;


@Component("car")
public class Car implements Brand {

	@Override
	public String BMW() {
		
		return "BMW X6,BMW M5 ";
	}

}
