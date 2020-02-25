package javaProject;

public class childClass extends parentClass{
	String color ="red";
	public static void main(String[] args) {
		
	childClass cc = new childClass();
	cc.engine();
	cc.brakes(32,34);
	cc.gear(23, 54);
	
	}
	
	public void engine() {
		
	System.out.println("engine");
	
	}
	
}
