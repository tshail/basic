package basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Demo {
	
        // Intialize webdriver
	WebDriver driver;
	
	// TestNG annotations (As per priority setting test cases should be executed sequentially.)
	@Test(priority=1)
	
	// Create Method.
	public void demo() throws Exception{
	
	// intialized chrome driver ("webdriver.chrome.driver","path of driver")
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUM\\lib\\chromedriver.exe");
		
		// creating instance for chrome driver
		driver = new ChromeDriver();
		
	// open url	
	driver.get("http://192.168.1.102/JIBE/Account/Login.aspx?");
		
	// wait constant	
	Thread.sleep(2000);
	
        //for maximize the webpage.
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
//--------------------------------------------- Test Case 1: Checking Log in functionality. ----------------------------------------------------------------------//
		
	// click on Login button.	
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
	
	// verify Error message.	
	String text=driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginUserValidationSummary']")).getText();
	System.out.println(text);
	
	//Enter Username	
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_UserName']")).sendKeys("shailesh");
		
	//Enter Password.	
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_Password']")).sendKeys("Jibe@123");
		
	// click on "login" button	
	driver.findElement(By.xpath(".//*[@id='ctl00_MainContent_LoginUser_LoginButton']")).click();
	Thread.sleep(2000);

//--------------------------------------------- Test Case 2: Mouse Hover functionality. ----------------------------------------------------------------------//		

	// Mouse hover on First Element	
	WebElement abcd=driver.findElement(By.linkText("Admin"));
	Actions action1=new Actions(driver);
	action1.moveToElement(abcd).build().perform();
	abcd.click();
	Thread.sleep(2000);
	
	// Mouse hover on second Element	
	WebElement admin = driver.findElement(By.xpath((".//*[@id='nav']/li[3]/ul/li[1]/a/span")));
	admin.click();
	action.moveToElement(admin).build().perform();

	// Mouse hover on Third Element
	WebElement TrainingTypes = driver.findElement(By.xpath(".//*[@id='nav']/li[3]/ul/li[1]/ul/li[7]/a/span"));
	TrainingTypes.click();
	Thread.sleep(5000);
	
//----------------------------------- Verify Page title--------------------------------------------------------//
		
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/selenium/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
	
	// launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
       
    }

}
	
//------------------------------------------ Follow below links ---------------------------------------------------------//
	
 1. https://www.guru99.com/first-webdriver-script.html	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
