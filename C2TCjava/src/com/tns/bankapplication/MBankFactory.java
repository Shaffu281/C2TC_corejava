package com.tns.bankapplication;

public abstract class MBankFactory extends BankFactory{



		@Override
		public int getNewsavingacc(int accNo, String accNm, float accBal, boolean isSalried) {
			// TODO Auto-generated method stub
			return super.getNewsavingacc(accNo, accNm, accBal, isSalried);
		}

		@Override
		public int getNewcurrentacc(int accNo, String accNm, float accBal, float creditlimt) {
			// TODO Auto-generated method stub
			return super.getNewcurrentacc(accNo, accNm, accBal, creditlimt);
		}



		}


