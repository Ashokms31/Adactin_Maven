package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class data_driven {
	
	public static void Read_data() throws Throwable {
		
		File f =new File("C:\\Users\\ashokms\\eclipse-workspace\\Maven_projectbd\\Excel\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet sheetAt =wb.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				
				Cell cell = row.getCell(j);
				
				org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
				
				
				if (cellType.equals(org.apache.poi.ss.usermodel.CellType.STRING)) {
					
					String stringCellValue = cell.getStringCellValue();
					
					System.out.println(stringCellValue);
					
					}
				
				else if(cellType.equals(org.apache.poi.ss.usermodel.CellType.NUMERIC)){
					
					double numericCellValue = cell.getNumericCellValue();
					
					int data =(int) numericCellValue;
					
					System.out.println(data);
				}
			}
			
			wb.close();
		}
		

	}
public static void main(String[] args) throws Throwable {
     Read_data();
}
}
