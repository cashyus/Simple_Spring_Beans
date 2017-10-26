package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file here
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the spring bean from the spring container here
		
			Coach theCoach = context.getBean("myCoach", Coach.class);  //mycoach = the bean id, coach.class is the interface
		//calling methods on the bean here
		
			System.out.println(theCoach.getDailyWorkout());
		
		//close the context here
			context.close();
	}

}
