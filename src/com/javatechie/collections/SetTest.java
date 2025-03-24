package com.javatechie.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		Set<User> users=new LinkedHashSet<>();
		users.add(new User("Shekhar",32 ));
		users.add(new User("Shekhar",32));
		users.add(new User("Bharath", 29));
		users.add(new User("Prabhakar",28 ));
		users.add(null);
		
		Set<String> names=new HashSet<>();
		names.add("Shekhar");
		names.add(null);
		names.add("Bharath");
		names.add("Prabhakar");
		
//		System.out.println("Shekhar".hashCode());
//		System.out.println("Shekhar".hashCode());
//		
//		System.out.println(new User("Shekhar",32 ).hashCode());
//		System.out.println(new User("Shekhar",32 ).hashCode());
		
		
		//users.forEach(System.out::println);
		
		//System.out.println(new User("Shekhar",32 ));
		
		//Set<User> usersOrder=new TreeSet<>(new AgeComparator());
		Set<User> usersOrder=new TreeSet<>();
		usersOrder.add(new User("Shekhar",35 ));
		usersOrder.add(new User("Karthik",32));
		usersOrder.add(new User("Bharath", 25));
		usersOrder.add(new User("Prabhakar",18 ));
		
		usersOrder.forEach(System.out::println);
		
		
		           

	}

}
