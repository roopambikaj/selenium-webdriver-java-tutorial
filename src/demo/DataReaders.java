package demo;

import java.util.List;

public class DataReaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		readCSV();
		readXLS();
		}
		
//	public static void readCSV() {
//			
//		String fileName ="/Users/roopa/Documents/UserAccounts.csv";
// 		List <String[]> records = utilities.CSV.get(fileName);
// 		for (String[] record : records) {
// 			for (String field : record) {
// 				System.out.println(field);
// 			}
// 		}
//		
//		}
	
	
	public static void readXLS() {
		
		String fileName ="/Users/roopa/Documents/UserLogin.xls";
 		String[][] data = utilities.Excel.get(fileName);
 		for (String[] record : data) {
 				System.out.println("\nNew Record -");
 				for (int i=0; i<record.length;i++) 
 				{
 				System.out.println(record[i]);
 			
 		}
		
		}
	}
	}


