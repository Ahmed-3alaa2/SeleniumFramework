package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;





public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Register")
	WebElement Registerlink;



	@FindBy(linkText = "Log in")
	WebElement loginlink;

	@FindBy(css ="a.ico-logout")
	WebElement lgoutbtn;



	public void OpenRegistrationPage() {

		Registerlink.click();
	}
	public void LoginPage() {
		loginlink.click();
	}
	
	public void userlogout() {
		lgoutbtn.click();
		
	}
}
