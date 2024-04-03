package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adduser {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id=\"username\"] ")
	WebElement Username;

	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement Useremail;
	
	public Adduser(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SendDataOnusername() {
		Username.sendKeys("Shivam");
	}
	public void SendDataOnemail() {
		Useremail.sendKeys("123@Admin");
	}
}
