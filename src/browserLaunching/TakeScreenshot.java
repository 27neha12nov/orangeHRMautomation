package browserLaunching;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	

	public static void main (String[]args) throws InterruptedException, IOException
	{
		int i=0;
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize(); // to maximize the current browser opened with selenium
		
		driver.get(" https://www.facebook.com/");
		Thread.sleep(3000);
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\12NOV_EVE\\"+ i +".png");
		FileHandler.copy(source, dest);
		i++;
		
		WebElement CreateNewAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateNewAccount.click();
		Thread.sleep(3000);
		
		//CAPTURESCREENSHOT
		

		File source1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("F:\\12NOV_EVE\\"+i+".png");
		FileHandler.copy(source1, dest1);
		i++;
		}
		
		public static String timestamp()
		{
			return new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss").format(new Date());	 
					

}
}