package com.dl.injection.quailfier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("showroom")
public class Showroom {
	
	
	@Value("${models.showroom}")
	private String showRoomName;

	public String getShowRoomName() {
		return showRoomName;
	}

	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}

	@Override
	public String toString() {
		return "showroom [showRoomName=" + showRoomName + "]";
	}
	
	

}
