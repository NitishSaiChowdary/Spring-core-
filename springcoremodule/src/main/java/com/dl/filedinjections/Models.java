package com.dl.filedinjections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Models {
	
	@Value("${models.name}")
	private String models;
	
	
	@Value("${models.type}")
	private String type;


	@Override
	public String toString() {
		return "Models [models=" + models + ", type=" + type + "]";
	}

}
