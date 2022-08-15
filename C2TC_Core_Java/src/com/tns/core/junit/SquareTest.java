package com.tns.core.junit;
import static org.junit.jupiter.api.Assertions.*;


public class SquareTest {

	
	 void test() {
		Testing t = new Testing();
		int r = t.square(5);
		assertEquals(25,r);
		
	}

}
