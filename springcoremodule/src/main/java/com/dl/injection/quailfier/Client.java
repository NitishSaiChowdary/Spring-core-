package com.dl.injection.quailfier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.dl.injection.quailfier")
@PropertySource("classpath:com/dl/injection/quailfier/application.properties")
class AppConfig {
}

public class Client {

    public static void main(String[] args) {
        // Initialize Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        // Retrieve the RF bean from the context
        RF rf = context.getBean(RF.class);
        
        // Print the RF bean
        System.out.println(rf);

        // Close the context to release resources
        context.close();
    }
}
