package com.javatechie.logicals;

public class Employee {
	String name;
	int salary;

	// Constructor
	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// Getter for salary
	public int getSalary() {
		return salary;
	}

	// Getter for name
	public String getName() {
		return name;
	}

}