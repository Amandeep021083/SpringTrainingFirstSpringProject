package com.edureka.firstSpringAppliction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

		User user =  (User) context.getBean("user");
		System.out.println(user.getName());
		
		Car car= (Car) context.getBean("car1");
		System.out.println(car.getName());
		System.out.println(car.getCost());		
		
		System.out.println(user.getCar().getName());
	}

}
