package com.tns.collections;
import java.util.HashSet;
public class HasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		for(int i=10;i>0;i--)
		{
			set.add(i);
			
		}
     for(int i:set)
     {
    	 System.out.println(i);
     }
	}

}
