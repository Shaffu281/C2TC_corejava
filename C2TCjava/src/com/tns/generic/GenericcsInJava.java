package com.tns.generic;

import java.util.ArrayList;

public class GenericcsInJava {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	    list.add("JAVA");
	    //list.add(123); Compile time error
for (String str : list)
	System.out.println(str);
	}

}
