package com.tns.core;



//hybrid inheritance
package com.tns.assignment2;

//parent class
class GrandFather {
	public void show() {
		System.out.println("I am grandfather.");
	}
}

//inherits GrandFather properties
class Father extends GrandFather {
	public void show() {
		System.out.println("I am father.");
	}
}

//inherits Father properties
class Son extends Father {
	public void show() {
		System.out.println("I am son.");
	}
}

//inherits Father properties
public class Inheritance5 extends Father {
	public void show() {
		System.out.println("I am a daughter.");
	}

	public static void main(String args[]) {
		Inheritance5 obj = new Inheritance5();
		obj.show();
	}
}
public class Inheritance5 {

}
