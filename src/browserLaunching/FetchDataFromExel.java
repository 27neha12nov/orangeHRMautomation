package browserLaunching;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;


public class FetchDataFromExel {

	public static void main(String[]args) throws EncryptedDocumentException, IOException {
	String path = "C:\\Users\\Kumari Neha\\Desktop\\Test.xlsx";
	
	FileInputStream file =new FileInputStream(path);

	Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
	//String value= WorkbookFactory.create(file).getSheet("velocity").getRow(i).getCell(j).getNCellValue;
	//   => To read string data
	for(int i=0; i<8; i++)
	{
		for(int j=0; j<2; j++)
		{
//			Row rw= s.getRow(i);
//			Cell cl= rw.getCell(j);
//			String value=cl.getStringCellValue();
			
			
			Cell c = s.getRow(i).getCell(j);
			String value=c.getStringCellValue();
//		String value= s.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(value+"       ");
			
		}
		    System.out.println();
	}
	}
	}
        
// double value= WorkbookFactory.create(file).getSheet("velocity").getRow(i).getCell(j).getNumericCellValue(); 
//   => To read numeric data
