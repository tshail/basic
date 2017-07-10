package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Demo {
 
	WebDriver driver;
	@Test(priority=1)
	public void demo() throws Exception{
	
		//WebDriver driver=driver1;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUM\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
	driver.get("http://192.168.1.102/JIBE/Account/Login.aspx?");
	Thread.sleep(2000);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
	String text=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginUserValidationSummary']")).getText();
	System.out.println(text);
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).sendKeys("shailesh");
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).sendKeys("Jibe@123");
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
	Thread.sleep(2000);
	
	//Mouseover admin
	WebElement abcd=driver.findElement(By.linkText("Admin"));
	Actions action1=new Actions(driver);
	action1.moveToElement(abcd).build().perform();
	abcd.click();
	//action1.moveToElement(abcd).perform();
	Thread.sleep(2000);
	
	/* WebElement crewm = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/a/span")));
	Actions action = new Actions(driver);
	action.moveToElement(crewm).build().perform();
	action.moveToElement(crewm).perform();
	Thread.sleep(2000);

	// Select "admin"
	WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
	admin.click();
	action.moveToElement(admin).build().perform();

	// Select "Training Types"
	WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[7]/a/span"));
	TrainingTypes.click();
	Thread.sleep(5000);
	
	//
*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}