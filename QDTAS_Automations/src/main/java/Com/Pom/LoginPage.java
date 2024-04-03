package Com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@id=\"email\"]")
	WebElement Email;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement Password;

	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement SubmitBtn;
	
	
	
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SendDataOnEmail() {
		Email.sendKeys("admin@gmail.com");
	}
	public void SendDataOnPassword() {
		Password.sendKeys("123@Admin");
	}
	public void ClickOnSubmit() {
		SubmitBtn.click();
	}

	
}
