package com.javatechie;

//class declaration
class Employee {
	
	//global variable or static variable
	 static String name;
	
	//instance variable
	double age;
	
	
	void getName(String name) {
		//local variables
		int local;
		//this.name=name;
	
		
		
		//System.out.print("Employee Name::"+name);
	}

	public static void main(String[] args) {
	//System.out.print("Hello Prabhakar");
		Employee emp1=new Employee();
		Employee emp2=new Employee();
	//emp1.getName("Shekhar");
	//System.out.print("Employee Name::"+name);
	//emp1.getName("Bharath");
	
	
	
	//static scenario
	emp1.name="Prabhar";
	//System.out.println(emp2.name);
	
	//instance scenario
		//emp1.age=30;
		//System.out.println(emp2.age);
	
	//create Employee1 object and print variable
	//Emplayee1 emp=new Emplayee1();
	//System.out.println(emp.quali);
	
	//Access static variable from outside of the call
	User e1=new User();
	System.out.println(e1.getUserName());
	}

}

public class User{
	
	public String quali = "dfd";
	
	private String device;
	
	 public String getUserName() {
		
//		System.out.println(Employee.name);
//		System.out.println(Employee.name);
//		System.out.println(Employee.name);
//		getNames();
//		System.out.println(Employee.name);
		
		return Employee.name;
	}

	private void getNames() {
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
//		System.out.println(User.name);
	}
	
	
	
	
	
}
