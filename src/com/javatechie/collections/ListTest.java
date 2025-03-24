package com.javatechie.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		
		//Interfaces
		/*
		 * Collection 
		 * List 
		 * Set 
		 * Map 
		 * Queue
		 */
		
		
		//Classes
		/*
		 * 
		 * ArrayList LinkedList Vector Stack
		 * 
		 * HashSet LinkedHashSet TreetSet
		 * 
		 * HashMap LinkedHashMap TreeMap HashTable
		 */
		
		List list=new ArrayList();
		list.add("Shekhar");
		list.add(new ArrayList());
		list.add(10);
		
		list.get(1);
		
		
		
		
		System.out.println(list);
		
		for(Object onbj:list) {
			System.out.println(onbj);
		}
		
		List<String> names=new ArrayList<>();
		names.add("Shekhar");
		//names.add(10);
		
		
		
	}

}
