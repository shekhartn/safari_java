package com.javatechie;

public class AccessModifiers1 {
	
	
	
	public static void main(String[] args) {
		
		User user=new User();
		
		System.out.println(new User().getUserName());
		System.out.println(user.getUserName());
		
	}

}
