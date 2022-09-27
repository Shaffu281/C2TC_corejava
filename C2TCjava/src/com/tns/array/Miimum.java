package com.tns.array;

public class Miimum {

	public static void main(String[] args) {
		int min=0;
		int arr[] = {20,10,30};
		min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i])
			min=arr[i];
		}
		
  System.out.println(min);
		// TODO Auto-generated method stub

	}

}
