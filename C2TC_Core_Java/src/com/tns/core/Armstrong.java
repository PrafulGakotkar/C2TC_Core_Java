package com.tns.core;

import java.util.Scanner;

public class Armstrong { //The Cube of each digit is equal to the number itself

	public static void main(String[] args) {
	int n,ON,r,R=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	n = sc.nextInt();
	ON = n;
	
	while (ON != 0) {
		r = ON % 10;
		R +=Math.pow(r,3);
		ON /= 10;
	}
	if (R==n) 
		System.out.println(n+" is an Armstrong number");
		
	else
		System.out.println(n+" is not an Armstrong number");

	}

}
