package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Components.FlightFinderComponent;
import UI_Components.LoginComponent;

public class AbstractTest {
	
	LoginComponent loginComponent;
	FlightFinderComponent flightFinderComponent;
	WebDriver driver;
	
	public AbstractTest() {
		loginComponent = new LoginComponent();
		flightFinderComponent= new FlightFinderComponent();
	}
	
	@BeforeTest
	public void setupEnvironment() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Toshiba\\Documents\\Selenium Env\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");	
		PageFactory.initElements(driver,loginComponent);
		PageFactory.initElements(driver,flightFinderComponent);
	}

	@AfterTest
	public void closeEnvironment() {
		driver.close();
	}
}
