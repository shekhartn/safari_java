package com.javatechie.logicals;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.*;

public class Main {

	public List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Bharath", 10000));
		employees.add(new Employee("sunil", 20000));
		employees.add(new Employee("anil", 30000));
		employees.add(new Employee("suresh", 40000));
		return employees;
	}

	public Optional<Integer> getsecondHeighestsalarry() {
		List<Employee> empl1 = getEmployeeList();

		Optional<Integer> stroreSalary = empl1.stream().map(e -> e.getSalary()).sorted(Comparator.reverseOrder())
				.skip(1).findFirst();
		return stroreSalary;
	}

	public static void main(String[] args) {
		System.out.println(new Main().getsecondHeighestsalarry().get());

	}

}
