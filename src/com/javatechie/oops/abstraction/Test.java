package com.javatechie.oops.abstraction;

public class Test {

	public static void main(String[] args) {
		
		MacLaptop mac=new MacLaptop();
		Demo demo=new Demo(mac);
		demo.printResults();
		System.out.println();
		DellLaptop dell=new DellLaptop();
		Demo dellDemo=new Demo(dell);
		dellDemo.printResults();
	}

}
