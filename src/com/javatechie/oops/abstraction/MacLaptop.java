package com.javatechie.oops.abstraction;

public class MacLaptop implements Laptop {

	@Override
	public void configuration() {
		System.out.println("MACBOOK...........");
		System.out.println("MACBOOK RAM 16GB");
		System.out.println("MC ROM 256GB");
		System.out.println("MC Processor Intel 7");
		
	}

	@Override
	public void screenSize() {
		System.out.println("MACBOOK SCREEN SIZE........");
		System.out.println("48 INCHES");
		
	}
	

}
