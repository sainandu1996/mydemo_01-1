package pack1;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Samanth_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		
		String S = driver.getTitle();
		String N = "Login";
		Assert.assertEquals(S, N);
		System.out.println("Login found");
		
		List<WebElement> T_links =driver.findElements(By.tagName("a"));
		int Cnt_links=T_links.size();
		System.out.println(Cnt_links);

		 for(int i=0;i<Cnt_links;i++)
		{
		String Links=T_links.get(i).getText();
		System.out.println(Links);
	}
		 
		
		
		
		
	
		
	}
	}
		