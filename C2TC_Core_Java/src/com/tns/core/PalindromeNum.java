package com.tns.core;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
	   int n,t,s=0,r;
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the number ");
	   n=sc.nextInt();
	   t=n;
	   
	   while (n>0) {
		   r = n%10;
		   s = (s *10)+r;
		   n=n/10;
		   
	   }
	   if(t==s) {
		   System.out.println("Palindrome Number ");
		
	   }
	   else {
		   System.out.println("number is not Palindrome ");
	   }
	}

}
