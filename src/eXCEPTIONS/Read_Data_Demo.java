package eXCEPTIONS;

import java.io.*;
import java.lang.*;

public class Read_Data_Demo {

	public static void main(String[] args) {
		
		File file=new File("Hello.txt");
		try
		{
			FileReader in = new FileReader(file);
			char[]  a= new char[50];
			in.read(a);
			for(char c:a)
			{
				System.out.println(c);
				
			}
		}catch(IOException e)
		{
			
			System.out.println("Exception is " +e);
		//	e.printStackTrace();
			e.toString();
		}
	
}
}
