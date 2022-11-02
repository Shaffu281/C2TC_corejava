package com.tns.bankapplication;

public  abstract class  SavingAcc extends BankAccount {

	SavingAcc(int accNo, String accNm, float accBal , boolean isSalaried) {
		// TODO Auto-generated constructor stub
	}
	private boolean isSalaried;
	private float MINBAL;
	public abstract void withdraw();
	public abstract String toString();



}



