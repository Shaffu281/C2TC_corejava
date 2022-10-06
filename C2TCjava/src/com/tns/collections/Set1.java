package com.tns.collections;
import java.util.HashSet;
import java.util.Set;
public class Set1 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		boolean check = s.isEmpty();
		System.out.println("Is Set empty:"+check);
		
		s.add("orange");
		s.add("Red");
		s.add("Blue");
		s.add("Yellow");
		s.add("Green");
		if(s.isEmpty())
		{
			System.out.println("Set is empty.");
		}
		else
		{
			System.out.println("Set is not empty.");
			System.out.println("Elements in the Set");
			System.out.println(s);
			
			s.remove("Blue");
			System.out.println("Set elemets after removing");
			System.out.println(s);
			
			int size = s.size();
			System.out.println("Total number of elemets:" +size);
			
			
		}
		
		// TODO Auto-generated method stub

	}

}
