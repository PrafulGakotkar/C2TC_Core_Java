package com.tns.core;


//concept of multiple inheritance
package com.tns.assignment2;

interface Event { // first interface
	public void start();
}

interface Sports { // second interface
	public void play();
}

interface Hockey extends Sports, Event { // third interface
	public void show();
}

public class Inheritance4 {
	public static void main(String[] args) {
		Hockey jockey = new Hockey() {
			public void start() {
				System.out.println("Start Event");
			}

			public void play() {
				System.out.println("Play Sports.");
			}

			public void show() {
				System.out.println("Show Hockey.");
			}
		};

		jockey.start();
		jockey.play();
		jockey.show();
	}
}
public class Inheritance4 {

}
