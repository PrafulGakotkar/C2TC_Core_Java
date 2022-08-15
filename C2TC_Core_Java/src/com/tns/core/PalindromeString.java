package com.tns.core;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
	
		String s, RS="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		s = sc.next();
		int i,SL = s.length();
		for (i=(SL-1);i>=0;--i) {
			RS =RS +s.charAt(i);
			
		}
		if(s.toLowerCase().equals(RS.toLowerCase()))
		{
			System.out.println(s+ " String is Palindrome");
		}
		else {
			System.out.println(s+ " String is not Palindrome");
		}
	}

}
