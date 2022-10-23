package com.tns.annotation;
//Creating custom annotation type called Student.
import java.lang.annotation.Documented;
@Documented//javdoc tool
// retained in .class file
public @interface Student {// custom annotation
	String firstName();
	String lastName();
	int rollNo();

}
