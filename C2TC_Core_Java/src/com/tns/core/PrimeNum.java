package com.tns.core;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
        int n,i,c = 0;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        
        n=s.nextInt();
        
        for(i=2;i<n;i++) {
        	if(n % i == 0) {
        		c++;
        		break;
        		
        	}
       	}
        if(c==0)
             System.out.println("It Is an Prime Number");
        else
        	System.out.println("It is Not A Prime Number");
	}

}
