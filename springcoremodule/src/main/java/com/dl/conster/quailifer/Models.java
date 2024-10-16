package com.dl.conster.quailifer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("bikemodels")
public class Models {
	
	
	
	private String model;
	
	
	private String type;

	public Models(@Value("${models.name}")String model, @Value("${models.type}")String type) {
		super();
		this.model = model;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Models [model=" + model + ", type=" + type + "]";
	}



	
	
}
