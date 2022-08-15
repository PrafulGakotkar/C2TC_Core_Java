// The below given comparator compares employees on the basis of their name 
package com.tns.core;
import java.util.Comparator;

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee emp1,Employee emp2) {
		String emp1Name = ((Employee) emp1).getName();
		String emp2Name = ((Employee) emp2).getName();
  //comparing Strings
		return emp1Name.compareTo(emp2Name);
		

		
	}
	
}