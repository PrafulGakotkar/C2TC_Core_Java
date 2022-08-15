package com.tns.core.BankApp.framework;

public class SavingAcc  extends BankAcc{
	 
	private static final float MINBAL = 0.0f;
	private static boolean isSalaried ;
	
	public SavingAcc(int AccNo,String accNm,float accBal,boolean isSalaried) {
		super(AccNo, accNm, accBal);
		this.isSalaried=isSalaried;
		
		
	}
	public void withdrow(float accBal) {
		
			System.out.println("Account Num is= "+this.getaccNo()+"Account Name is= "+this.getaccNm()+"Account Bal is: "+accBal);
			
			}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s,toString=%s]", isSalaried,super.toString());
		
	}
}
