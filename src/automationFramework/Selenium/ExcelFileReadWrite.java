package automationFramework.Selenium;
import java.io.IOException;

import utility.*;

public class ExcelFileReadWrite {
	public static void main(String[] args) throws IOException {
		
		String path= Constant.Path_TestData+Constant.File_TestData;
		String[] valueToWrite = {"Mr. E","Noida","Hero"};
		ExeclUtilsNew readFile = new ExeclUtilsNew();
		//readFile.ReadExcel(Constant.File_TestData, Constant.Path_TestData, "Sheet1");
		//readFile.WriteExcel(Constant.File_TestData, Constant.Path_TestData, "Sheet1", valueToWrite);
		readFile.WriteExcelRow(Constant.File_TestData, Constant.Path_TestData, "Sheet1",1,2,"PASS");
		
	}

}
