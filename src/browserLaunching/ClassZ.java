package browserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Point;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.TakesScreenshot;


public class ClassZ 
{
	
	public static void main (String[]args) throws InterruptedException, IOException
	{
		int i=0;
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize(); // to maximize the current browser opened with selenium
		
		driver.get(" https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.manage().window().minimize(); // to minimize the current browser opened with selenium
		
		//driver.navigate().to("https://www.selenium.dev/downloads");
		//Thread.sleep(3000);
		
		/*driver.navigate().back();   //navigate to previous condition
		Thread.sleep(3000);
		driver.navigate().forward();   ////navigate to forward condition
		Thread.sleep(3000);
		driver.navigate().refresh();

		String url=driver.getCurrentUrl();    //to get currently available url
		System.out.println(url);
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//Dimension d2= new Dimension(800,400);  //pixel
	//	driver.manage().window().setSize(d2);   // to change size of browser
	//	Thread.sleep(5000);
		
	//	Point p =new Point(300,600); //(x,y)
	//	driver.manage().window().setPosition(p);  //to change position of browser
		
	//	driver.close();                             // to close current tab
	//	driver.quit();                            // to close entire browser
		
		
	/*	WebElement userName= driver.findElement(By.id("email"));      // located by ID
		userName.sendKeys("Velocity.com");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.name("pass"));     // Located by Name
		password.sendKeys("Velocity@1234");
		 Thread.sleep(3000); */
		
	//	WebElement loginButton= driver.findElement(By.tagName("button"));    //located by tagname
	//	loginButton.click();
		
	//	WebElement loginButton1= driver.findElement(By.linkText("Create new account")); //with the help of text
	//	loginButton.click();
		
//	    WebElement loginButton2= driver.findElement(By.partialLinkText("new account"));  //with the help of partial text
//		loginButton2.click();
		
    //	WebElement loginButton3= driver.findElement(By.className("_97w5"));  // with the help of the text
	//	loginButton3.click();
		
		// X path by Attribute
		
	//	WebElement loginButton4= driver.findElement(By.xpath("//button[@name='login']"));
	//	loginButton.click();
		
		// X path by text
		 
	//	WebElement loginButton5= driver.findElement(By.xpath("//button[text()='Log in']")); //with the help of the text
	//	loginButton.click();
		
		
	
//	WebElement CreateNewAccount= driver.findElement(By.xpath("//*[text()='Create new account']"));
//	CreateNewAccount.click();
//	Thread.sleep(3000);
//	
		
//	WebElement Day= driver.findElement(By.xpath("//select[@id='day']"));
//	Select s = new Select(Day);
//	Thread.sleep(2000);
//	s.selectByVisibleText("26");
	
//	s.selectByValue("27");
//	s.selectByIndex(9);
	
//	WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
//	Select s2=new Select(month);
//	s2.selectByIndex(0);
//	Thread.sleep(3000);
//	s.selectByIndex(9);
	
	
/*	WebElement birthDayDOB= driver.findElement(By.id("day"));
	Select ref = new Select(birthDayDOB); //Select method of selenium is used to deal with Drop Down and List Down
  //  selectByIndex() Method of Select Method in Selenium: select data with passed index value
	ref.selectByIndex(3);    // In case of HTML indexing starts with 1 and in Java starts with 0
	Thread.sleep(2000);
	
	
	WebElement birthMonthDOB =driver.findElement(By.id("month"));
	Select ref1 = new Select(birthMonthDOB);
//  selectByVisibleText() Method of Select Method in Selenium: It will select text which is passed as value
	ref1.selectByVisibleText("jul");   // pass value mention in drop box or list down option code
	Thread.sleep(2000);
	
	

	WebElement birthyearDOB= driver.findElement(By.id("year"));
	Select ref2 = new Select(birthyearDOB);
	//selectByValue() Method of select method in selenium: it will select value of passed option value
	ref2.selectByValue("1996");   // pass value of option which will select respective value from drop down
	Thread.sleep(2000);
	
	WebElement genderMale= driver.findElement(By.xpath("//label[text()='Male']"));
	boolean result= genderMale.isSelected();
	System.out.println(result);
	if(result==false)
		genderMale.click();
	Thread.sleep(2000); */
	
//	WebElement SignUpButton =driver.findElement(By.xpath("//button[contains(@class, '_97w5')][1]"));
//	boolean result2= SignUpButton.isEnabled();
//	System.out.println(result2);
//	if(result2==true)
//		SignUpButton.click();
//	Thread.sleep(2000);
		
}
}
