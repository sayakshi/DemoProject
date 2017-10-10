package automationFramework;
import utility.ExcelUtils;
import utility.Constant;
public class Apache_POI_TC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String path= Constant.Path_TestData+Constant.File_TestData;
		
		ExcelUtils.setExcelFile(path, "Sheet1");
		//String Suser= ExcelUtils.getCellData(1,1);
		//System.out.println(Suser);
		ExcelUtils.setCellData("PASS", 1, 4);
		
	}

}
