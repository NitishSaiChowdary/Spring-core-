package com.dl.setterinjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RF {
	
	private Models models;

	public Models getModels() {
		return models;
	}
    @Autowired
	public void setModels(Models models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "RF [models=" + models + "]";
	}
	
	

}
