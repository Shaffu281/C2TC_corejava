package com.tns.bankapplication;

public abstract class CurrentAcc extends BankAccount {
	public CurrentAcc (int accNo, String accNm, float accBal,float creditlimit) {
	  
	  // TODO Auto-generated constructor stub
	}
	public final float creditLimit = 0;
	public abstract void withdraw();
	public abstract String toString();
}
