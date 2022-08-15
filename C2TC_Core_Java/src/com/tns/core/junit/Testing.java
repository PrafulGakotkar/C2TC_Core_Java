package com.tns.core.junit;
import org.junit.jupiter.api.RepeatedTest;


public class Testing {
	@RepeatedTest(2)
      void sum() {
    	  int a=10;
    	  int b=20;
    	  System.out.println(a+b);
      }
	//method for square of number3
	int square(int x) {
		return x*x;
	}
	
	//Method for counting a character from word
	int countA(String word) {
		int count =0;
		for (int i = 0;i<word.length();i++) {
			if(word.charAt(i)=='a' ||word.charAt(i)=='A' ) {
				count++;
			}
		}
		return count;
	}
      
}
