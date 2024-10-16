package com.dl.dependency.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class client {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Brand bike = context.getBean("bike",Brand.class);
		System.out.println(bike.BMW());

		Brand car =  context.getBean("car",Brand.class);
		System.out.println(car.BMW());
		context.close();
		
	}

}
