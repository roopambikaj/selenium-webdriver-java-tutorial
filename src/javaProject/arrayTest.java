package javaProject;

public class arrayTest {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for (int i=0; i<b.length;i++) {
			for (int j=0;j<b.length;j++) {
				String str = " ";
				System.out.print(b[i][j] + str);
			}
			System.out.println();
		}
	}
}
	