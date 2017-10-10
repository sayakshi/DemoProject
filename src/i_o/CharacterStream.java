package i_o;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		
		FileReader in = null;
		FileWriter out = null;
		int c;
		try {
			in = new FileReader("C:/Users/esayind/Desktop/Documents/file/inputFile.txt");
			out = new FileWriter("C:/Users/esayind/Desktop/Documents/file/outFile1.txt");

			while ((c = in.read()) != -1) {

				out.write(c);

			}

		} finally {
			if (in != null) {

				in.close();
			}

			if (out != null)

			{
				out.close();

			}
		}

	}

		// TODO Auto-generated method stub

	}


