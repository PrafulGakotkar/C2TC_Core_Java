package com.tns.core.BankApp.framework;

public abstract class BankAcc {
	
	private int accNo;
	private float accBal;
	private String accNm;
	
	public int getaccNo() {
		return accNo;
	}
	public void setaccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getaccBal() {
		return accBal;
	}
	public void setaccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getaccNm() {
		return accNm;
	}
	public void setaccNm(String accNm) {
		this.accNm = accNm;
	}

	public BankAcc(int accNo , String accNm, float accBal) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public void withdraw(float accBal) {
		System.out.println("withdrawal ammount is"+ accBal);
		
	}
	public void deposite(float accBal){
		System.out.println("Depostied amount is "+accBal);
		
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s accBal=%s]",accNo,accNm,accBal);			
   }
	
}
	
	
	
	
	
	
