package com.edureka.firstSpringAppliction;

public class User {

	private String name;
	private Car car;

	public User(Car car) {
		System.out.println("Constructor is called");
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		System.out.println("setter on user is called.");
		this.car = car;
	}

}
