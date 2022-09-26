package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	
	private static void writedata() throws IOException {
		
		File f=new File("C:\\Users\\ashokms\\eclipse-workspace\\Maven_projectbd\\Excel\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		wb.createSheet("Project_details").createRow(0).createCell(0).setCellValue("Role");
		
		wb.createSheet("Project_details").getRow(0).createCell(1).setCellValue("Id");

		wb.createSheet("Project_details").createRow(1).createCell(0).setCellValue("Developer");
		
		wb.createSheet("Project_details").createRow(1).createCell(1).setCellValue("dev@123");
		
		FileOutputStream fos= new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("successfully written");
		
	}
	
	public static void main(String[] args) throws IOException {
		writedata();
	}

}
