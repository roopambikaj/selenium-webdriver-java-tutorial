package stringHandling;

public class reserveAString {
	
	public static void main(String[] args) {
		String str1 = "";
		String str = "madam";
		for (int i=str.length()-1;i>=0;i--) {
			
			str1= str1+str.charAt(i);
			
		}
		System.out.println(str1); 
		
		if(str.equals(str1)) {
			System.out.println("str is palindrom " + str1); 
		}
		else {
			System.out.println("str is not palindrom" + str1); 
		}
	}

}
