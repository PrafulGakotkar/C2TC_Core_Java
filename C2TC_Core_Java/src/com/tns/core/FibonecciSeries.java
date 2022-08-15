package com.tns.core;

import java.util.Scanner;

public class FibonecciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int p1=0,p2=1,p,i;
		System.out.println(p1+"\n"+p2);
		
		for(i=2;i<n;i++) {
			 p = p1+p2;
			 System.out.println(p);
			 p1=p2;
			 p2=p;
		}
	   // System.out.println(n);
	}

}
