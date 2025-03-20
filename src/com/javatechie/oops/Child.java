package com.javatechie.oops;

public class Child extends Parent{
	
	public void writing() {
		System.out.println("Right hand writing");
	}
	
	public void writing(String lang) {
		if(lang.equalsIgnoreCase("German")) {
			System.out.println("Right hand writing with German");
		}else {
			writing();
		}
	}
	
	public void getPlay() {
		System.out.println("He will play cricket");
	}
	
	
	

}
