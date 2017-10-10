package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;

	public static void setExcelFile(String Path, String sheetName) throws Exception {
		try {
			// Open ExcelFile
			FileInputStream in = new FileInputStream(Path);

			// Accessing row

			ExcelWBook = new XSSFWorkbook(Path);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);

		} catch (Exception e) {

			System.out.println("exception iis" + e);
		}
	}

	public static String getCellData(int row, int column) throws Exception {

		try {
			Cell = ExcelWSheet.getRow(row).getCell(column);
			String value = Cell.getStringCellValue();
			return value;

		} catch (Exception e)

		{
			throw (e);

		}
	}

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

		try {

			Row = ExcelWSheet.getRow(RowNum);
			

			Cell = Row.getCell(ColNum);

			if (Cell == null) {

				Cell = Row.createCell(ColNum);

				Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

			// Constant variables Test Data path and Test Data file name
			File file = new File(Constant.Path_TestData + "\\" + Constant.File_TestData);
			FileOutputStream fileOut = new FileOutputStream(file);

			ExcelWBook.write(fileOut);

			// fileOut.flush();

			fileOut.close();

		} catch (Exception e) {

			throw (e);

		}

	}

}