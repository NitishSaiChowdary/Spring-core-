package com.dl.conster;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Models {
	
	
	private String models;
	
	private String type;


	public Models(@Value("${models.name}") String models, @Value("${models.type}") String type) {
		super();
		this.models = models;
		this.type = type;
	}


	@Override
	public String toString() {
		return "Models [models=" + models + ", type=" + type + "]";
	}

}
