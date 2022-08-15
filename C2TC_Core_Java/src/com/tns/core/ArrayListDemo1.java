package com.tns.core;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String []args) {
		ArrayList l = new ArrayList();//Growable in nature
		l.add("P"); //heterogeneous
		l.add(5000);//support of in built methods
		l.add(40.5);
		l.add(null);
		l.remove(2);
		
		l.add(2, "A");
	
		System.out.println(l);
	}

}
