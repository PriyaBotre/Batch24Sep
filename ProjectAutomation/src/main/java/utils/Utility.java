package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver,String testID) throws IOException 
	{   
		try
		{
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\PRIYA\\OneDrive\\Documents\\TestCaseScreenshot\\testID.png");
			FileHandler.copy(src, dest);
			System.out.println("Screenshot taken");
		}
		catch (Exception e)
		{
			System.out.println("Exception while taking screenshot"+e.getMessage());
		}
	}
	
	public static String getDataFromExcelSheet(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		String path="C:\\Users\\PRIYA\\OneDrive\\Documents\\AUTOMATION PROJECT TEST DATA.xlsx";
        FileInputStream file=new FileInputStream(path);  
		
		String data=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		  
		double value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		System.out.println(value);
		return path;
		
	}

	

	

}
