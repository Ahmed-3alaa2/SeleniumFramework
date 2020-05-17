package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageRegisteration extends PageBase {

	public PageRegisteration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="gender-male")
	WebElement Chkbox;
	@FindBy(id="FirstName")
	WebElement FnBOx;
	
	@FindBy(id="LastName")
	WebElement LnBox;
	
	@FindBy(id="Email")
	WebElement mail;
	
	@FindBy(id="ConfirmEmail")
	WebElement ConfirmMail;
	
	@FindBy(id="Username")
	WebElement Username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(id="ConfirmPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	WebElement rgstrbtn;
	public void userRegistration(String FirstName ,String LastName,String Email,String Pass ,String ConfirmPass) {
		Chkbox.click();
		FnBOx.sendKeys(FirstName);
		LnBox.sendKeys(LastName);
		mail.sendKeys(Email);
		//Username.sendKeys(username);
		//ConfirmMail.sendKeys(ConfirmEMail);
		Password.sendKeys(Pass);
		ConfirmPassword.sendKeys(ConfirmPass);
		rgstrbtn.click();
	}
	

}
