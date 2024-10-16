package com.dl.conster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RF {
	
	private Models models;
	@Autowired
	public RF(Models models) {
		super();
		this.models = models;
	}
	@Override
	public String toString() {
		return "RF [models=" + models + "]";
	}
    



}
