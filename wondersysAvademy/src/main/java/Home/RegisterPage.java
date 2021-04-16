package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public RegisterPage(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	 @FindBy(xpath = "//*[@id='my-nav']/form/a[2]")
	 public WebElement Registerbutton;
	 
	 @FindBy(id = "nameInput")
	 public WebElement registernamne;
	 
	 @FindBy(id = "emailInput")
	 public WebElement registerEmail;
	 
	 @FindBy(id = "phone_noInput")
	 public WebElement registerPhonenumber;
	 
	 
	 @FindBy(id = "passwordInput")
	 public WebElement registerpassword;
	 
	 @FindBy(id = "password-confirm")
	 public WebElement registerconfirmpassword;
	 
	 @FindBy(className = "submit-button")
	 public WebElement registersubmitbutton;
	 
	 @FindBy(xpath = "//*[@id='signup-form']/button")
	 public WebElement registerclosebutton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegisterbutton() {
		return Registerbutton;
	}

	public WebElement getRegisternamne() {
		return registernamne;
	}

	public WebElement getRegisterEmail() {
		return registerEmail;
	}

	public WebElement getRegisterPhonenumber() {
		return registerPhonenumber;
	}

	public WebElement getRegisterpassword() {
		return registerpassword;
	}

	public WebElement getRegisterconfirmpassword() {
		return registerconfirmpassword;
	}

	public WebElement getRegistersubmitbutton() {
		return registersubmitbutton;
	}

	public WebElement getRegisterclosebutton() {
		return registerclosebutton;
	}
	 
	 
	 

}
