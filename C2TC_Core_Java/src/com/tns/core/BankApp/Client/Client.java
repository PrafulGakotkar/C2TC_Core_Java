package com.tns.core.BankApp.Client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) 
	{
		 MMBankFactory s=new MMBankFactory();
		Object obj=s.getNewSavingAcc(11, "praful", 1000, true );
		 System.out.println(obj);
		SavingAcc n=new MMSavingAcc(101, "Anurag", 10000f, true);
	    CurrentAcc c1= new MMCurrentAcc(102,"Vipul", 10000, 20000);
		System.out.println("Saving Account");
		 n.withdraw(1000);
	    System.out.println("Current Account");
		c1.withdraw(2000);
		c1.getaccBal();
		System.out.println(s.getNewSavingAcc(103, "Akshay", 15000, false));
		System.out.println(s.getNewCurrentAcc(103, "Prajval", 20000, 23000f));
		System.out.println(n);
		System.out.println(c1);
		
		
	}

}