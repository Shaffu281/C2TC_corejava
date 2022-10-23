package com.tns.generic;

class Gen <T>
{
   T ob;
 Gen(T o)
 {
	 ob = o;
 }
 public T getob()
 {
	 return ob;
 }
}
public class Demo {
	
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Gen  iob = new Gen <>(100);

		// In x = iob.getOb();
		System.out.println(iob);
		Gen sob = new Gen <> ("Hello");
		// String star=sob.getOb();
		 System.out.println(sob);
		// TODO Auto-generated method stub

	}

}
