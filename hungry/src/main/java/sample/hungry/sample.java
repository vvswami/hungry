package sample.hungry;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
	
	
	
	@Test
	public void open()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com");
		 System.out.println("URL Launch");
		 driver.quit();
		
		
	}
	
	

}
