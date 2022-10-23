package com.tns.collections;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] array = new int[] {20,30,7,2,17};
			Arrays.sort(array);
			System.out.println("Elements of array sorted");
			for(int i=0; i<array.length;i++)
			{
				System.out.println(array[i]);
			}
	}

}