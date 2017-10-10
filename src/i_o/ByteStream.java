package i_o;

import java.io.*;

public class ByteStream {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;
		char c;
		try {
			in = new FileInputStream("C:/Users/esayind/Desktop/Documents/file/inputFile.txt");
			out = new FileOutputStream("C:/Users/esayind/Desktop/Documents/file/outFile.txt");

			while ((c = (char) in.read()) != -1) {

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

}
