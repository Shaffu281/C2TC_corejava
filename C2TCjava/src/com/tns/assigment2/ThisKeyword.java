package com.tns.assigment2;
public class ThisKeyword {

	int c;
	public  ThisKeyword(int c){
		this.c=c;
	}
	public static void main(String[] args) {
		ThisKeyword vc=new ThisKeyword(5);
		System.out.println("the value of this c is ="+vc.c);
	}


}
