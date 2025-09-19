package com.qspiders.dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		//To read data vertically (row)
		//getLastRowNum() is used to get the index of the last row containing data in the sheet
//		int lastRow = wb.getSheet("InvalidData").getLastRowNum();
//		for(int i = 0; i <= lastRow; i++) {
//			String rowData = wb.getSheet("InvalidData").getRow(i).getCell(0).getStringCellValue();
//			System.out.println(rowData);
//		}
		
		//To read data horizontally (column)
		//getLastCellNum() is used to get the count of the last cell containing data in the row
//		short lastCell = wb.getSheet("InvalidData").getRow(0).getLastCellNum();
//		for(int i = 0; i < lastCell; i++) {
//			String cellData = wb.getSheet("InvalidData").getRow(0).getCell(i).getStringCellValue();
//			System.out.println(cellData);
//		}
		
		//To read all the row and column in the excel
		int lastRow = wb.getSheet("InvalidData").getLastRowNum();
		for(int i = 0; i <= lastRow; i++) {
			short lastCell = wb.getSheet("InvalidData").getRow(i).getLastCellNum();
			for(int j = 0; j < lastCell; j++) {
				String data = wb.getSheet("InvalidData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "    ");
			}
			System.out.println();
		}
	}
}
