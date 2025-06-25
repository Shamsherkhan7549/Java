package com.example;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Mobile{
	int id;
	String name;
	int price;

	public Mobile(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}

public class TreeMapDemo {
public static void main(String str[]) {
	
	Mobile nokia = new Mobile(1, "Nokia", 1500);
	Mobile samsung = new Mobile(2, "Samsung", 12000);
	Mobile apple = new Mobile(3, "Apple", 150000);
	Mobile lava = new Mobile(4, "Lava", 1000);
	
	// TreeMap
	Map<Integer, Mobile> map = new TreeMap();
	
	map.put(nokia.id, nokia);
	map.put(samsung.id, samsung);
	map.put(apple.id, apple);
	map.put(lava.id, lava);
	
	Set s = map.keySet();
	
	Iterator it = s.iterator();
	
	if(!s.isEmpty()) {
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
	}
	
	
	
}

}
