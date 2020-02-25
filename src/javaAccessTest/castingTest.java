package javaAccessTest;

//import java.util.Scanner;

public class castingTest {
	
	public static void main(String[] arg) {
		
		byte b = 80; //1 byte, -128 to 127
//		short s; //2 byte
		int i= 100; //4 byte
		long l=54; //8 byte
		
		i=b; // implicit type casting.
		b=(byte)l;// explicit type casting.
		System.out.println(i+ " " + b);
		
		String str = "3466";
		int j =  Integer.parseInt(str);
		
		System.out.println("j: " +j);
		
		
		String si = String.valueOf(i);
		
		System.out.println("s: " +si.length());
		
		
//		char c1 ='a', c2 = 'A';
		int a =1, b2=a+1, c=a/b;
		int ii= a*b2;
		System.out.println("ii:" +a + +b2 + +c);
		ii =ii%a;
//		Scanner input1 = new Scanner(System.in);
//		String val = input1.nextLine();
//		int value = Integer.parseInt(val);
//		
//		System.out.println("value: " + (value+5));
		
	}
	

}
