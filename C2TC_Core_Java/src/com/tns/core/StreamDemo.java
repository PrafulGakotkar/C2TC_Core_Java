package com.tns.core;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l = List.of(10,12,4,25,36,98,74,22,37,54);
		System.out.println(l);
		List<Integer> evenList = new ArrayList<>();
		for(Integer i: l)
		{
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);
		
	}

}
