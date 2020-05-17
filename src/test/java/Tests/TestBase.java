package Tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Pages.PageBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utlities.Helper;

public class TestBase extends AbstractTestNGCucumberTests {

	protected static WebDriver driver;
	
	@BeforeSuite
	public void StartDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
		
	}
	
	@AfterSuite
	public void StopDriver() {
	//	driver.quit();
	}
	
	@AfterMethod
	public void screenshotonfailure(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			Helper.captureScreenshot(driver, result.getName());
		}
	}
}
