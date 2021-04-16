package student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Changepassword {
	WebDriver driver;
	 
	 public Changepassword(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	
	
	@FindBy(xpath = "//*[@id='my-nav']/div/div/a")
	public WebElement StudentName;
	
	
	@FindBy(xpath = "(//*[text()='Change Password'])[1]")
	public WebElement Changepassword;
	
	@FindBy(name = "oldpassword")
	public WebElement oldpassword;
	
	@FindBy(name = "password")
	public WebElement newpassword;
	
	@FindBy(name = "password_confirmation")
	public WebElement confirmpassword;
	
	@FindBy(xpath = "//*[@id='password-form']/div/div/div[2]/div[4]/button")
	public WebElement passwordsubmitbutton;
	
	@FindBy(xpath = "//*[@id='password-form']/button")
	public WebElement passwordclosebutton;
	
	
	
	

}
