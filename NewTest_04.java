package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTest_04 {
		  WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  
	  WebElement El1= driver.findElement(By.xpath("//a[text()='Add-Ons']"));
	  
	  Actions act1= new Actions(driver);
	  
	  act1.moveToElement(El1).build().perform();
	  
	 
	  
  }
}
