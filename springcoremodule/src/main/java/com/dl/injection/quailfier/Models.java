package com.dl.injection.quailfier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("bikemodels")
public class Models {
	
	
	@Value("${models.name}")
	private String model;
	
	@Value("${models.type}")
	private String type;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "models [model=" + model + ", type=" + type + "]";
	}
	
	

	
}
