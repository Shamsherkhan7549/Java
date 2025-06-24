package com.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
public static void main(String[] str) {
	
	Map map = new TreeMap();
	
	Scanner sc = new Scanner(System.in);
	
	int i = 1; 
	while(i<=3) {
		System.out.println("Enter Key: ");
		int key = sc.nextInt();
		System.out.println("Enter value: ");
		String value = sc.next();

		map.put(key, value);
		
		i++;
	}
	
	//Print key
	
	Set s = map.keySet();
	
	Iterator it = s.iterator();
	
	if(!(s.isEmpty())) {
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	// Print Value
	Collection c = map.values();
	
	 it = c.iterator();
			
	
			while(it.hasNext()) {
				System.out.println(it.next());
			}

	
	// Print key value pairs
	
	Set s2 = map.entrySet();
	
	it = s2.iterator();
	
	if(!(s2.isEmpty())) {
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
	}
	
	
	
	
	
	
	
}
}
