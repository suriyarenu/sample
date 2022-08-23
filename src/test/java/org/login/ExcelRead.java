package org.login;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.InflaterOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class ExcelRead {

	public static void main(String[] args, XSSFWorkbook book) throws IOException {

		
		File f= new File("C:\\Users\\Surya\\Desktop\\name1.xlsx");

		
		Workbook workbook=new XSSFWorkbook();

		
	    Sheet createSheet = book.createSheet("surya"); 
	    
	    
	   Row createRow = createSheet.createRow(0);
	   
	   
	   Cell createCell = createRow.createCell(0);
	   
	   
	   createCell.setCellValue("raja");
	   
	   
	   FileOutputStream out = new FileOutputStream(f);
	   

		
		book.write(out);
		
			
		
			
			
			
			
			
			
			
			
			
			
			
	
		
			
			
		}	

} 
	