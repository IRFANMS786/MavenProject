package basics;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelRowValidation {
    public static void main(String[] args) {
        String excelFilePath = "C:\\Users\\ikhaisarbash\\Downloads\\UPLOAD/file.xlsx";
        
        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = WorkbookFactory.create(fis)) {
            
            Sheet sheet = workbook.getSheetAt(0); // Assuming you're working with the first sheet
            
            int rowCount = sheet.getPhysicalNumberOfRows();
            
            System.out.println("Number of rows in the Excel sheet: " + rowCount);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
