package Com.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
public static WebDriver setup()  {
	  
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://qdtas-hrm-frontend-one.vercel.app/");
		driver.manage().window().maximize();
		return driver;
				
		
}

}
