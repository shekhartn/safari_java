package com.javatechie.oops.abstraction;

public class DellLaptop implements Laptop {

	@Override
	public void configuration() {
		System.out.println("DELL...........");
		System.out.println("RAM 16GB");
		System.out.println("ROM 256GB");
		System.out.println("Processor Intel 7");
		
	}

	@Override
	public void screenSize() {
		System.out.println("DELL SCREEN SIZE........");
		System.out.println("36 INCHES");
		
	}

}
