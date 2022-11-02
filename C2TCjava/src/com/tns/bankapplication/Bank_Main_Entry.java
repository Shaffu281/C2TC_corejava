package com.tns.bankapplication;

public abstract class Bank_Main_Entry {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
            MBankFactory BankFactory=new  MBankFactory();
            
            MSavingAcc SavingsACC = new   MSavingAcc(345768, "Shafinaz" , 1000, true);
            MCurrentAcc CurrentACC = new    MCurrentAcc(678048, "Nazz" , 500, false);
			// d and e 
			 SavingsACC.withdraw();
			 SavingsACC.toString();
			 CurrentACC.withdraw();
			 CurrentACC.toString();



		}

	}

