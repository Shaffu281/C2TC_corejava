
package com.tns.lamda;
interface Statement {
	public String greet();
}
public class Lamdawithoutparameter {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Statement s = () -> ("return Hellow World.");
		System.out.println(s.greet());
	}

}
