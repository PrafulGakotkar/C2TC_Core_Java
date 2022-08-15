package com.tns.core;
import java.util.ArrayList;

public class ArrayListDemo<T>{
	public static void main(String []args) {
		ArrayListDemo<Integer> t1 = new ArrayListDemo<Integer>();
		
		/*//Array 
		String [] A= new String[500];
		A[0] = "Ajinkya";
		A[1]="Praful";
		A[2] = 55;
		*/
		
		ArrayList p= new ArrayList();
		p.add("Ajinkya");
		p.add("Praful");
		p.add(11);
		
		String emp1 = (String)p.get(0);
		String emp2 = (String)p.get(1);
		String emp3 = (String)p.get(2);
		
		
	}

}
