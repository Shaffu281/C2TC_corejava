package com.tns.collections;
import java.util.ArrayList;
import java.util.Iterator;

public  class ArrayList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<String> al = new ArrayList<String>();
 al.add("jack");
 al.add("Tyler");
Iterator<String> itr= al.iterator();
 while(itr.hasNext()) {
	System.out.println(itr.next());
			
	}
		
	}

}
