package daksh;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class GetDataFromExcelToJson {

	public static void main(String[] args) throws Exception {
		
		List sheetData = new ArrayList();
	        
		FileInputStream casesInputStream = new FileInputStream("C:\\Users\\Vaibhav\\Desktop\\documents-export-2015-12-04\\Medak_Case.xlsx");
		XSSFWorkbook casesWorkBook = new XSSFWorkbook(casesInputStream);
	    XSSFSheet sheet = casesWorkBook.getSheetAt(0);

		
		Iterator rows = sheet.rowIterator();
        while (rows.hasNext()) {
            XSSFRow row = (XSSFRow) rows.next();
            Iterator cells = row.cellIterator();

            List data = new ArrayList();
            while (cells.hasNext()) {
                XSSFCell cell = (XSSFCell) cells.next();
                data.add(cell);
            }

            sheetData.add(data);
        }
        
        for (int i = 0; i < sheetData.size(); i++) {
			System.out.println(sheetData.get(i));
		}
	        casesWorkBook.close();
	        System.out.println("File written successfully");

	      System.out.println("Opened database successfully");
	}

}
