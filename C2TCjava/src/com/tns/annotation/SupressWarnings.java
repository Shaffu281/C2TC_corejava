package com.tns.annotation;
import java.util.ArrayList;
public class SupressWarnings {
	@SuppressWarnings({ "unchecked","rawtype" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arList = new ArrayList();
		arList.add("Orange");
		arList.add("Pink");
		arList.add("Red");
		arList.add("Green");
		arList.add("Blue");
		for(Object obj : arList) {
			System.out.println(obj);
		}
		
	}

}
