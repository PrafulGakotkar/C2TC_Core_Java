package com.tns.core;
import java.util.ArrayList;


public class Wrapper {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		Integer i = new Integer(10);
		Float f = new Float(4.5);
		Boolean b = new Boolean("YES");
		Boolean c = new Boolean("NO");
		
		l.add(i);
		l.add(f);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
		System.out.println(c);
		System.out.println(c.equals(b));

	}

}
