package com.dl.filedinjections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(" com.dl.filedinjections")
@PropertySource("com/dl/filedinjections/application.properties")
class AppConfig{
	
}
public class Client {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		
		RF rf=context.getBean(RF.class);
		System.out.println(rf);
		context.close();
	}

} 
