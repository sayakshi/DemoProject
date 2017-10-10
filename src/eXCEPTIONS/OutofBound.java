package eXCEPTIONS;
import java.lang.*;
import java.io.*;

public class OutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[5];
		int i;
		
		try
		{
			for(i=0;i<8;i++)
			{
				array[i]=i;
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println(e);
		}
		
		}

	}


