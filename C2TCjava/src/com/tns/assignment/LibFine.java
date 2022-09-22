package com.tns.assignment;
import java.util.Scanner;//package
public class LibFine
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days=sc.nextInt();
		int Fine;
		System.out.println("Enter the number of days late :"+days);
		if(days<=5) {
			Fine=days*1;//logic
		}else if(days<=10) {
			Fine=(5*1)+(days-5)*5;
		}else {
			Fine=(5*1)+(5*5)+(days-10)*10;
		}
	
          System.out.println("For"+days+"days late.fine is "+ Fine);
	}

}