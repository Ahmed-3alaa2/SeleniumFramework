package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(id="Email")
	WebElement Email;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(css ="input.button-1.login-button")
	WebElement lgnbtn;
	
	 
  
	public void userlogin(String Mail,String Pass) throws InterruptedException {
		Email.click();
		wait.until(ExpectedConditions.elementToBeClickable(Email));
		Email.sendKeys(Mail);
		Password.sendKeys(Pass);
		lgnbtn.click();
		
	}
	

	
	

	
}
