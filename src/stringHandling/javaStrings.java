package stringHandling;

public class javaStrings {
	
	public static void main(String[] args) {
		
		String str = "test_1";// or String str= new String("test_1")
		System.out.println("str char: " + str.charAt(3));
		System.out.println("str length: " + str.length());
		str = str.concat("Test 2");
		System.out.println("str: " + str); 
		System.out.println("str: " + str.indexOf("_")); 
		System.out.println("str: " + str.substring(3, 6)); 	
		
	}

}
