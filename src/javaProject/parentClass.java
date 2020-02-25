package javaProject;

public class parentClass {
	String color ="red";
	public static void main(String[] args) {
		
	
	}
	
	public void brakes(int a, int b) {
		
	System.out.println("brakes");
	int sum = a+b;
	System.out.println("sum:" +sum);
	
	
	}
	
	public void gear(int a, int b) {
		
		System.out.println("gear");
		int diff = ++b-(--a);
		System.out.println("sum:" +diff);
		}
}
