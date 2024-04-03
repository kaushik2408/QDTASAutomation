package Com.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Base.BaseClass;
import Com.Pom.Adduser;


public class AddUserTest extends BaseClass  {
	 WebDriver driver;
	 @Test
	 public void verifyAdduser()  {
		 Adduser au=new Adduser(driver);
		 au.SendDataOnusername();
		 au.SendDataOnemail();
		 
		
		
		 
	 }
	 @BeforeTest
		public void OpenBrowser() throws InterruptedException {
			driver=BaseClass.setup();
			
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
		}
}
