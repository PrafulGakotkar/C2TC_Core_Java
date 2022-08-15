package com.tns.core;

import java.util.Scanner;

public final class Factorial {
	public static void main(String []args) {
	
		int i,n,m=1;
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter A number:");
		n=S.nextInt();
		for(i=1;i<=n;i++) {
			m=m*i;
		}
		
		System.out.println("Factorial of "+n);
		System.out.println("is "+m);
	}

}
