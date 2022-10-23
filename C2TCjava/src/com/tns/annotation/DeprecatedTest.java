package com.tns.annotation;

public class DeprecatedTest {
	public void x() {
		System.out.println("Hellow x");
	}
  //@Deprecated
	public void y() {
		System.out.println("Hellow y");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DeprecatedTest obj = new DeprecatedTest ();
		 obj.x();
		 obj.y();
	}

}
