package com.dl.injection.quailfier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RF {

	
	private Models model;
	
	
	private Showroom showroom;


	public Models getModel() {
		return model;
	}

    @Autowired
    @Qualifier("bikemodels")
	public void setModel(Models model) {
		this.model = model;
	}


	public Showroom getShowroom() {
		return showroom;
	}

    @Autowired
    @Qualifier("showroom")
	public void setShowroom(Showroom showroom) {
		this.showroom = showroom;
	}


	@Override
	public String toString() {
		return "RF [model=" + model + ", showroom=" + showroom + "]";
	}
	
	


	
	

}
