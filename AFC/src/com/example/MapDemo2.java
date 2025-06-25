package com.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo2 {
public static void main(String str[]) {
	
	Map map = new TreeMap();
	
	map.put(1,"hello");
	map.put(2,"raj");
	map.put(2,"Welcome");
	map.put(3,"back");
	
	Set s = map.keySet();
	
	Iterator it = s.iterator();
	
	while(it.hasNext()) {
		Integer id =  (Integer)it.next();
		System.out.println(id + ": " + map.get(id));
	}
	
	System.out.println("------Arrays to List-------");
	
	Integer arr[] = {1,2,3,4};
	List<Integer> ls = Arrays.asList(arr);
	
//	ls.add(6);  // this will give run time error because list is referring to array and array is fixed .
	
	for(Integer e: arr) {
		System.out.println(e);
	}
	
	
	
}
}
