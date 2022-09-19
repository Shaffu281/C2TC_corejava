package com.tns.assigment2;

import Project.ThisKeyWord;

public class ThisKeyword {
	int c;
	public ThisKeyword(int c) {
		this.c=c;
	}
	public static void main(String[] args) {
		ThisKeyWord vc=new ThisKeyWord(5);
		System.out.println("the value of this c is ="+vc.c);
	}

}
