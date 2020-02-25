package javaProject;

public class accessModifiersTest {

	public void hello() {
		System.out.println("public");
		this.onlyClass();
	}
	
	private void onlyClass() {
		int a =10;
		System.out.println(a);
		
	}
	
	void defaultPackClass() {
		int b=200;
		System.out.println(b);
	}
	
	protected void protectedTest() {
		int c = 465;
		System.out.println(c);
	}
	
}
