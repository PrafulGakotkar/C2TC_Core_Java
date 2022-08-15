package com.tns.core;

import java.util.Arrays;
import java.util.List;

public class WildCard {

	public static void main(String[] args) {
	    List<Integer> list1 =Arrays.asList(14,78,96,32,54,65);
	    
	    List<Double> list2 = Arrays.asList(14.5,78.6,96.2,32.45,54.66,65.87);
	    
	    printlist(list1);
	    
	    printlist(list2);
	    

	}
	public static void printlist(List<?> list)//Using generic method and wildcard Operator
	{
		System.out.println(list);
	}

}
