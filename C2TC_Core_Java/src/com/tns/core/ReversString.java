package com.tns.core;

import java.util.Scanner;

public class ReversString {
	public static void main(String []args)
	{
		String s, rev="" ;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		s=sc.next();
		for (int i= s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
		}
		
	System.out.println("Original String "+s);
	
	System.out.println("Reverse String "+rev);
		
	}

}
