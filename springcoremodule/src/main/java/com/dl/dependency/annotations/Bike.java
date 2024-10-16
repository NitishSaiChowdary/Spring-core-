package com.dl.dependency.annotations;

import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Brand {

	@Override
	public String BMW() {
		// TODO Auto-generated method stub
		return "BMW S 1000 XR,BMW G 310 GS";
	}

}
