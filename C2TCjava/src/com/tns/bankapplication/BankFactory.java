package com.tns.bankapplication;

public abstract class BankFactory {


		/*getNewSavingAcc Public SavingAcc AccNo, accNm, accBal, isSalaried
	getNewCurrentAcc Public CurrentAcc AccNo, accNm, accBal, 
	creditLimi*/
		public int newsavingacc;
		public int newcurrentacc;
		private int CurrentAcc;
		private int SavingAcc;


		public int getNewsavingacc( int accNo, String accNm, float accBal, boolean isSalried ) {
			return SavingAcc;
		}
		public void setNewsavingacc(int newsavingacc) {
			this.newsavingacc = newsavingacc;
		}
		public int getNewcurrentacc(int accNo, String accNm, float accBal,float creditlimt) {
			return CurrentAcc;
		}
		public void setNewcurrentacc(int newcurrentacc) {
			this.newcurrentacc = newcurrentacc;
		}



	}

