package javaProject;

import java.io.IOException;

public class basics {
	
	public static void main(String[] args) throws IOException {
		
//		System.out.println("test");
//		int a=2;
//		int b=3;
//		int sum=a+b;
//		System.out.println("Sum:" +sum);
//		
//		validateHeader test =new validateHeader();
//		System.out.println(test.validate());
		
		FileHandlingTest obj = new FileHandlingTest();
		
		
	
		obj.fileWritterCSV("/Users/roopa/Documents","UserAccounts.csv", "test");
		obj.fileReaderCSV("/Users/roopa/Documents","UserAccounts.csv");
		
		
	}


}
