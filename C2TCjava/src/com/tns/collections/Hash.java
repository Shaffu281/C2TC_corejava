package com.tns.collections;
import java.util.HashSet;
public class Hash {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		set.add("Fifth");
		
		set.add("First");
		set.add("Second");
		
		set.add(null);
		set.add(null);
		
		System.out.println("Unorderd ad o Duplicate HashSet Elements");
		System.out.println(set);
		
		

	}

}
