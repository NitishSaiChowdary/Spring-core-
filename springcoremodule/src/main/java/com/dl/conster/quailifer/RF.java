package com.dl.conster.quailifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RF {

    private Models model;
    private Showroom showroom;

    @Autowired
    public RF(@Qualifier("bikemodels") Models model,@Qualifier("showroom") Showroom showroom) {
        this.model = model;
        this.showroom = showroom;
    }

    @Override
    public String toString() {
        return "RF [model=" + model + ", showroom=" + showroom + "]";
    }
}
