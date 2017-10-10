package i_o;

import java.io.*;


public class StandardStream {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader cin=null;
		BufferedReader br =null;
		try
		{
			cin= new InputStreamReader(System.in);
			/*System.out.println("Enter Lines terminating with q");
			char c;
			do
			{
				c = (char) cin.read();
				System.out.println(c);
				
			}while(c!='q');*/
			br = new BufferedReader(cin);
			
			System.out.println("Enter Lines");
			String s = br.readLine();
			System.out.println(s);
		}
		finally
		{
			if (cin !=null)
				cin.close();
		}
	}
}
