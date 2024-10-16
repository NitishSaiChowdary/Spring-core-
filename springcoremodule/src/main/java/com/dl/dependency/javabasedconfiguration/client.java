package com.dl.dependency.javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SuppressWarnings("unused")
public class client {
	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contextBike = new AnnotationConfigApplicationContext(Bike.class);
		Bike bike = contextBike.getBean("bike",Bike.class);
		System.out.println(bike.BMW());
		contextBike.close();
		
		AnnotationConfigApplicationContext contextCar = new AnnotationConfigApplicationContext(Car.class);
		Car car = contextCar.getBean("car",Car.class);
		System.out.println(car.BMW());
		contextBike.close();
	}

}
