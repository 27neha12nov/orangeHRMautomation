package browserLaunching;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class InstagramLogin {

	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		Thread.sleep(3000);
		
	//	driver.get(" https://www.facebook.com/");
		
		WebElement LoginButton= driver.findElement(By.xpath("//*[text()='Log in']"));
		Actions act= new Actions (driver);		
		act.moveToElement(LoginButton).click().build().perform();
		
		
//		WebElement draggable= driver.findElement(By.xpath("//*[@id='draggable']"));
//		WebElement droppable= driver.findElement(By.xpath("//*[@id='droppable']"));
//		Actions act= new Actions (driver);
		
//		act.dragAndDrop(draggable, droppable).perform();
		
		
//		act.click();
//		act.doubleClick();
//		act.contextClick();
//		act.moveToElement(WebElement ref);
//		act.dragAndDrop(WebElement ref, WebElement ref);
//		act.build();
//		act.perform();
			
	}
}
