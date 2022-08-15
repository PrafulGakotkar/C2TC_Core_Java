package com.tns.core;

import java.util.Scanner;

public class ReverNum {
	
	public static void RN(int num) {
		if (num<10) {
			System.out.println(num);
			
		}
		else {
			System.out.print(num%10);
			RN(num/10);
			
		}
	}
	
	
	
	public static void main(String []args)
	{
		int s;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		s=sc.nextInt();
			
	System.out.println("Original Number "+s);
	
	System.out.println("Reverse String ");
	RN(s);
		
	}
}
