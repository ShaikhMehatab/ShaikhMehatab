package FileHandling;

import java.io.*;
import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;


public class ReadExcel {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs=new FileInputStream(new File("C:\\Mehatab Shaikh\\Workspace\\Day7\\efile.xls"));
		HSSFWorkbook hb=new HSSFWorkbook(fs);
		HSSFSheet hs= hb.getSheetAt(0);
		FormulaEvaluator fl=hb.getCreationHelper().createFormulaEvaluator();
		for(Row row:hs)
		{
			for(Cell cell:row)
			{
				
				switch(cell.getCellType())
				{
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
					
				}
			}
			System.out.println();
			
		
		}
		
		
}
	
}
