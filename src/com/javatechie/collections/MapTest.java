package com.javatechie.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String,User> usersMap=new HashMap<>();
		usersMap.put("developers", new User("Shekhar",32));
		usersMap.put("developers", new User("Bharath",29));
		usersMap.put("developers", new User("Prabhakar",30));
		usersMap.put("testers", new User("Pavan",39));
		usersMap.put("testers", new User("Saroja",32));
		usersMap.put("devops", new User("Ramesh",32));
		usersMap.put("devops", new User("Aneer",32));
		
//		Set<Entry<String,User>> values=usersMap.entrySet();
//		
//		values.forEach(System.out::println);
		
		 // Custom comparator for reverse order sorting
//        TreeMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
//
//        map.put(3, "Banana");
//        map.put(1, "Apple");
//        map.put(2, "Mango");
//
//        System.out.println("TreeMap (Descending Order): " + map);
//        
//        List<String> names=Arrays.asList(new String[]{"shekhar","Karthik","Bharath"});
//        Collections.sort(names);
//        names.forEach(System.out::println);
        
//        CopyOnWriteArrayList<Integer> numbers 
//        = new CopyOnWriteArrayList<>(new Integer[]{1, 3, 5, 8});
			List<Integer> numbers = new ArrayList<>();
			numbers.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 8 }));

			Iterator<Integer> numberit = numbers.listIterator();
			while (numberit.hasNext()) {
				numberit.remove();
				System.out.println(numberit.next());

			}
	}

}
