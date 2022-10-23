package com.tns.annotation;

public class Hello {
	// Importing annotation on a method display().
    @Student (firstName = "Shafinaz", lastName = "S", rollNo = 20)
	public void display()
	{
		// TODO Auto-generated method stub
    System.out.println("Hello annotation");
	}
}
