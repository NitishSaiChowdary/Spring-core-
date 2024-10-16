package com.dl.filedinjections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RF {
	@Autowired
	private Models models;

	@Override
	public String toString() {
		return "RF [models=" + models + "]";
	}
	

}
