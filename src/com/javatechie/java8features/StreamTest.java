package com.javatechie.java8features;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.javatechie.collections.User;

public class StreamTest {

	public static void main(String[] args) {
		Set<User> users=new HashSet<>();
		users.add(new User("Shekhar",32 ));
		users.add(new User("Ramesh",31));
		users.add(new User("Bharath", 29));
		users.add(new User("Prabhakar",28 ));
		users.add(new User("Supritha",32 ));
		users.add(new User("Saroja",31));
		users.add(new User("Sravani", 29));
		users.add(new User("Saritha",28 ));
		
		Set<User> usersMoreThan30=new HashSet<>();
		
		users.forEach(user->{
			if(user.getAge()>30) {
				usersMoreThan30.add(user);
			}
		});
		
		usersMoreThan30.forEach(System.out::println);
		
//		List<String> names=users.stream()
//		.filter(user->user.getAge()>10)
//		.sorted(Comparator.reverseOrder())
//		.map(User::getName)
//		.skip(2)
//		.collect(Collectors.toList());
//		//.forEach(System.out::println);
//		
//		System.out.println(names);

		Map<Integer,List<User>> names=users.stream()
				.filter(user->user.getAge()>10)
				.sorted(Comparator.reverseOrder())
				.skip(2)
				.collect(Collectors.groupingBy(user->user.getAge()));
		
		System.out.println(names);
	}
                          
}
