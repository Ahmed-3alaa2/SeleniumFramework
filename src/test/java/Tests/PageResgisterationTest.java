package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.PageRegisteration;

public class PageResgisterationTest extends TestBase {

	HomePage homeobject;
	PageRegisteration Registerobject;
	LoginPage loginpage;
	
@Test(priority = 1)
	public void UserCanRegisterSuccessfully() {
		homeobject = new HomePage(driver); 
		homeobject.OpenRegistrationPage();
		Registerobject = new PageRegisteration(driver);
		Registerobject.userRegistration("Ahmed", "Alaa", "ahmed_ala02@hotmail.com", "Qwer1234", "Qwer1234");
		
	}
	
	
	
	@Test(priority = 3)
	public void userlogin() throws InterruptedException {
		homeobject = new HomePage(driver);
		homeobject.LoginPage();
		loginpage = new LoginPage(driver);
		loginpage.userlogin("ahmed_ala02@hotmail.com", "Qwer1234");
		
		
	}
	@Test(priority = 2)
	public void Userlogout() {
		homeobject = new HomePage(driver);
		homeobject.userlogout();
	}
}
