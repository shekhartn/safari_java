package com.javarocks;

import com.javatechie.User;
import com.javatechie.oops.Parent;

class Test {

	public static void main(String[] args) {
		User user=new User();
		System.out.println(user.getUserName());
		
		Parent parent=new Parent();
		//parent.gender()//We won't able to access from outside package
		
		GrandChild child=new GrandChild();
		child.getGender();
		
	}

}
