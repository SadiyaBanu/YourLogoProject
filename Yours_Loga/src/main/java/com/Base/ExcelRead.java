package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead 
{
	public String readExcel1(int col) throws IOException
	{
		File f = new File("src\\test\\resources\\TestData\\LogaRegister.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow r = sh.getRow(1);
		XSSFCell c = r.getCell(col);
		String data = c.getStringCellValue();
		return data;
	}
	public String readExcel2(int col) throws IOException
	{
		String value;
		File f = new File("src\\test\\resources\\TestData\\LogaRegister.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow r = sh.getRow(1);
		XSSFCell c = r.getCell(col);
		value = NumberToTextConverter.toText(c.getNumericCellValue());
		return value;
	}

}
