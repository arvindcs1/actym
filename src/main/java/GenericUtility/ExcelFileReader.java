package GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileReader {
	/*
	 * to read data from excel file
	 */

	public String ExcelRead(String Sheet, int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\eclipse-workspace\\actym-framework\\src\\main\\resources\\exceldata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(Sheet);
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(sheet.getRow(row).getCell(col));
		
		return data;

	}
}
