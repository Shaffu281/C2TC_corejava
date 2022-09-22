package com.tns.assignment;
public class Instringnegpos 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int negatives=1, positives=1;
	      int  num [] = {1,2,3,4,5,6,7,-4,-6,14,45,-7};

	      for(int i=0;i<num.length;i++)
	         {
	               if (num[i]<0)
	               {
	                  negatives*=num[i];
	               }
	         }
	         

	         System.out.println("The product of negatives is " + negatives);
	         //System.out.println("The product of positives is " + positives);
	      }
}