package com.scheduler.epsilon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SignUpTest1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(SignUpTest1Application.class, args);
		Signup s = con.getBean(Signup.class);
		s.show();
//		
//		Signup s1 = con.getBean(Signup.class);
//		s1.show();
		
		
	}

}
