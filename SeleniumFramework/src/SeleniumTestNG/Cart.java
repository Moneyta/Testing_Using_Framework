package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Cart extends BaseClass{
//public Actions act3;
	@Test
	public void CartDetail() throws InterruptedException {
		Actions act3=new Actions(driver);
		act3.moveToElement(driver.findElement(By.xpath("//span[text()='Cart']"))).perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _7UHT_c']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _I6-pD _7UHT_c']")).click();
		Thread.sleep(2000);
	}
	
	
}



