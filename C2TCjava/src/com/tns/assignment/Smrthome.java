package com.tns.assignment;
import java.util.Scanner;

class Smrthome {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int hrs=sc.nextInt();
        if(hrs<18)
        {
            System.out.println("lights on");
        }
        else if(hrs<=24&&hrs>18){
        System.out.println("lights off");    
        }
        
    }
}