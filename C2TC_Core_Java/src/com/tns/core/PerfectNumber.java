package com.tns.core;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String []args) {//A number whose sum of factor is equal to the number is called perfect number
		
		long i, n,S=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n= sc.nextInt();
		
		for(i=1;i<n;i++) {
			if (n % i==0) {
				S = S+i;
				
			}
		}
		if(S==n)
			System.out.println(n+" is an Perfect number");
		else
			System.out.println(n+" is not an Perfect number");
		
	}

}
