package come.assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetAssingment {
	
	/*
	 * .Write a Java program that finds and prints the union of two sets.
	 * Then check if union set is a subset of set1 or not.
	 */
	
	
	public static void main(String[] str) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(2);
		System.out.println(" set1 : " + set1);
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(3);
		set2.add(4);
		System.out.println(" set2 : " + set2);
		Set<Integer> unionSet = new TreeSet<>();
		
		unionSet.addAll(set1);
		unionSet.addAll(set2);
		
		System.out.println("Union set : " + unionSet);
		
		boolean isSubset_set1 = set1.containsAll(unionSet);

		System.out.println("Is union a subset of set1? : " + isSubset_set1);
		
		
		
		
	}
	
}
