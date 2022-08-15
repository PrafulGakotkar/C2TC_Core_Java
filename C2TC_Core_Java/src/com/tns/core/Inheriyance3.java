package com.tns.core;
//concept of Hierarchical inheritance
package com.tns.assignment2;

class A { // parent class
	public void print_A() {
		System.out.println("Class A");
	}
}

class B extends A { // child class
	public void print_B() {
		System.out.println("Class B");
	}
}

class C extends A { // child class
	public void print_C() {
		System.out.println("Class C");
	}
}

class D extends A { // child class
	public void print_D() {
		System.out.println("Class D");
	}
}

//Driver Class
public class Inheritance3 {
	public static void main(String[] args) {
		B obj_B = new B();
		System.out.println("//Class B can retrieve methods from A and itself");
		obj_B.print_A();
		obj_B.print_B();
		System.out.println("--------------");
		C obj_C = new C();
		System.out.println("//Class C can retrieve methods from A and itself");
		obj_C.print_A();
		obj_C.print_C();
		System.out.println("--------------");
		D obj_D = new D();
		System.out.println("//Class D can retrieve methods from A and itself");
		obj_D.print_A();
		obj_D.print_D();
	}
}

public class Inheriyance3 {

}
