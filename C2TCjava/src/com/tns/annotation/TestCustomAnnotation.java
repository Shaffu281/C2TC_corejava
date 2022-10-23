package com.tns.annotation;

	import java.lang.reflect.Method;
 //Accessing annotation
	public class TestCustomAnnotation {

		public static void main(String[] args) throws NoSuchMethodException, SecurityException {
			{	// TODO Auto-generated method stub
			Hello h = new Hello(); // Creating object of class Hello.
			h.display();// Calling method of Hello class.
			Method m = h.getClass().getMethod("diplay");
			Student st = m.getAnnotation(Student.class);
			 System.out.println("First name:" +st.firstName());
			 System.out.println("last name:" +st.lastName());
			 System.out.println("Roll number:" +st.rollNo());
		}
	}
	}

