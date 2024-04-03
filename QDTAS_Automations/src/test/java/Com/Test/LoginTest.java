package Com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;

import Com.Pom.LoginPage;

public class LoginTest extends BaseClass {
	
	 public WebDriver driver;
	 
	 @Test
	 public void VerifyLogin()  {
		 LoginPage lp=new LoginPage(driver);
		 lp.SendDataOnEmail();
		 lp.SendDataOnPassword();
		 lp.ClickOnSubmit();
		 
		
		
		 
	 }
	 @BeforeTest
		public void OpenBrowser() throws InterruptedException {
			driver=BaseClass.setup();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		    
		    System.out.println("1");
			
		}
}
