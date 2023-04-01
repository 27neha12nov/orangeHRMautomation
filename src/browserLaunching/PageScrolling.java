package browserLaunching;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrolling {
	
	
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,900)");          // scroll down
		Thread.sleep(3000);                                  // scroll up
		js.executeScript("window.scrollBy(0,-500)");         // scroll to right
		Thread.sleep(3000);                                  // scroll to left
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(3000);               //(x,y)

		
		WebElement ele= driver.findElement(By.xpath("//a[text()='Show']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(7000); 
		driver.quit();           
	
}
}