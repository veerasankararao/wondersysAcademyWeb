package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public LoginPage(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	
	
	@FindBy(xpath = "//*[@id='my-nav']/form/a[1]")
	public WebElement loginhome;
	
	
	@FindBy(name = "email")
	public WebElement loginemail;
	
	@FindBy(name = "password")
	public WebElement loginpassword;
	
	@FindBy(xpath = "( //button[@class='submit-button'])[1]")
	public WebElement loginsignin;
	
	@FindBy(linkText = "Forgot Your Password?")
	public WebElement LoginForgetpassword;
	
	@FindBy(id="email")
	public WebElement forgotemail;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement forgotemailsendbutton;
	
	
	@FindBy(xpath = "//button[@title='Close (Esc)']")
	public WebElement loginClose;


	


	
	


	public WebElement getLoginhome() {
		return loginhome;
	}


	public WebElement getLoginemail() {
		return loginemail;
	}


	public WebElement getLoginpassword() {
		return loginpassword;
	}


	public WebElement getLoginsignin() {
		return loginsignin;
	}


	public WebElement getLoginForgetpassword() {
		return LoginForgetpassword;
	}


	public WebElement getForgotemail() {
		return forgotemail;
	}


	public WebElement getForgotemailsendbutton() {
		return forgotemailsendbutton;
	}


	public WebElement getLoginClose() {
		return loginClose;
	}
	

	
}
