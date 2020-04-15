package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
public	WebDriver driver;
public	Actions act;

		@BeforeClass
		public void lunchBrowser() {
			System.setProperty("webdriver.chrome.driver","D:\\SeleniumDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		}
		@BeforeMethod
		public void loginToFlipKart() throws InterruptedException {
			
			act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Login']"))).perform();
			//Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9776537829");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Money@143");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			Thread.sleep(5000);
		}
		@AfterMethod
		public void logoutFromFlipkart() throws InterruptedException {
			act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[text()='Money']"))).perform();
			Thread.sleep(2000);
			//Actions act1=new Actions(driver);
			//act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//div[text()='Logout']"))).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Logout']")).click();
			Thread.sleep(2000);
		}
		@AfterClass
		public void closeBrowser() {
			driver.close();
			
		}
		
		
}
