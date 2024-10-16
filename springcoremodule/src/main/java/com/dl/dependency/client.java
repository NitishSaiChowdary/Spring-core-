package com.dl.dependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/dl/dependency/applicationContext.xml");
		//get beans
		Brand car =context.getBean("car", Brand.class);
		System.out.println(car.honda());
		
		Brand bike =context.getBean("bike", Brand.class);
		System.out.println(bike.honda());
		
		
		
		
		context.close();
		
	}

}
