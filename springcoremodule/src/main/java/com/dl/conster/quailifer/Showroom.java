package com.dl.conster.quailifer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("showroom")
public class Showroom {
	
	
	
	private String showRoomName;

	public Showroom(@Value("${models.showroom}")String showRoomName) {
		super();
		this.showRoomName = showRoomName;
	}

	@Override
	public String toString() {
		return "Showroom [showRoomName=" + showRoomName + "]";
	}
	
	

}
