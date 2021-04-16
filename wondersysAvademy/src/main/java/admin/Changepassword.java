package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changepassword {
	WebDriver driver;

	public Changepassword(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[1]/div[4]/div[2]/div/div/div/div/div/div/a")
	public WebElement WondersysAcademy;

	@FindBy(xpath = "//button[text()='Change Password']")
	public WebElement ChangePassword;
	
	@FindBy(name = "oldpassword")
	public WebElement oldpassword;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "password_confirmation")
	public WebElement confirmpassword;
	
	
	@FindBy(xpath = "//*[@id='passwordForm']/div[4]/div[1]/button")
	public WebElement Submitchangepassword;
	
	@FindBy(xpath = "//*[@id=\"changePasswordModal\"]/div/div/div[1]/button/span")
	public WebElement closeChangepassword;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWondersysAcademy() {
		return WondersysAcademy;
	}

	public WebElement getChangePassword() {
		return ChangePassword;
	}

	public WebElement getOldpassword() {
		return oldpassword;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSubmitchangepassword() {
		return Submitchangepassword;
	}

	public WebElement getCloseChangepassword() {
		return closeChangepassword;
	}
	
	

}
