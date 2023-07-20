package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(how =How.XPATH, using="//input[@id='username']")WebElement UserNameElement;
	@FindBy(how =How.XPATH, using="//input[@id='password']")WebElement PasswordElement;
	@FindBy(how =How.XPATH, using="//button[@name='login']")WebElement SignOnButtonElement;
	
	//Individual methods
	public void insertUserName(String UserName){
		UserNameElement.sendKeys(UserName);
	}
	
	public void insertPassword(String Password) {
		PasswordElement.sendKeys(Password);
	}
	
	public void clickOnSignInButton() {
		SignOnButtonElement.click();
	}
	
	
	
}
