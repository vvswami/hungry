package sample.hungry;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	
	
	@Test
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\Vishnu Sir_Selenium\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.buildeeji.com");
		 System.out.println("URL Launch");
		 driver.quit();
		
	}
	
	

}
