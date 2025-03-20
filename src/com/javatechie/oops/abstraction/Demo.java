package com.javatechie.oops.abstraction;

public class Demo {
	
	private Laptop laptop;
	
	public Demo(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void printResults() {
		laptop.configuration();
		System.out.println("-------------------");
		laptop.screenSize();
	}

}
