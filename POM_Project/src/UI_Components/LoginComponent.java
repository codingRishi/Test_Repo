package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bds_Queries.servicesCall;

public class LoginComponent {

	@FindBy(name="userName")
	static WebElement usernameEditbox;
	
	@FindBy(name="password")
	static WebElement passwordEditBox;
	
	@FindBy(xpath="//*[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//*[@src='/images/spacer.gif'][1]//following::font")
	static WebElement loginVerificationText;

	public void login() {
		usernameEditbox.sendKeys("batman");
		passwordEditBox.sendKeys("batman");
		loginButton.click();
	}
	
    public boolean verifyLoginFunc() {
	String actualText = loginVerificationText.getText();
	String expectedText = servicesCall.getLoginVerificationText();
	if( actualText.equals(expectedText)) 
		return true;
	else
		return false;
	
    }
}
