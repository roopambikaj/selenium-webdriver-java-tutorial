package javaAccessTest;

import javaProject.accessModifiersTest;

public class publicAccessTest extends accessModifiersTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		accessModifiersTest test = new accessModifiersTest();
		publicAccessTest tp = new publicAccessTest();
//		test.hello();
//		test.defaultPackClass(); -- cant access since default package
		
		tp.protectedTest();
		tp.hello();
		
	}

	
	
}
