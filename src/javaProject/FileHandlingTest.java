package javaProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingTest {

	
	public void fileWritterCSV(String filePath, String fileName, String data) throws IOException {
		
		File f = new File(filePath + "/" + fileName);
		FileWriter fw = new FileWriter(f,true);
//		fw.write(data);
//		fw.flush();
//		fw.close();
		
		
		BufferedWriter br = new BufferedWriter(fw);
		br.newLine();
		br.write("test12324324");
		br.flush();
		br.close();

		
	}
	
	
	public void fileReaderCSV(String filePath, String fileName) throws IOException {
		
		File f = new File(filePath + "/" + fileName);
		FileReader fr = new FileReader(f);
		int i= fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
//		fr.close();

		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while (s!=null)
		{
			System.out.println(s);
			s = br.readLine();
		}
	}

}
