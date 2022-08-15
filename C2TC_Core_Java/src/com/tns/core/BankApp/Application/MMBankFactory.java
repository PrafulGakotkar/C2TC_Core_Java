package com.tns.core.BankApp.Application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class MMBankFactory {

	
	public MMSavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried)
	{
		MMSavingAcc s=new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return s;
	}


	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit)
	{
		MMCurrentAcc c=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit);
		return c;
	}


}
