package com.tns.bankapplication;

public abstract class BankAccount {
	
	     private int accNo;
	     private String accNm;
	     private float accBal;
	      
	     public int getAccno() {
	    	 return accNo;	  
	     }
	     public void setAccno(int accno) {
	    	 this.accNo = accno ;
	     }
	     public String getAccName() {
	    	 return accNm;
	     }
	     public void setAccNm(String accNm) {
	    	 this.accNm = accNm;
	     }
	     public float getAccBal() {
	    	 return accBal;
	     }
	     public void setAccBal(float accBal) {
	    	 this.accBal = accBal;
	     }
	   
		public void withdraw(float  withdraw ) {
			if(this.getAccBal()-withdraw<0) {
				System.out.println("withdraw succesful,balace is "+ this.getAccBal());
			}
			else {
				this.setAccBal(this.getAccBal()- withdraw);
				System.out.println("withdraw successful,curret alance is"+this.getAccBal());
			}
		}
	@Override
		public String toString() {//overriding the toString() method
			return accBal+" "+accNm+" "+accBal;
		}

	}


