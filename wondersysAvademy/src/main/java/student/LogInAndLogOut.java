package student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInAndLogOut {
	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public LogInAndLogOut(WebDriver driver1) {
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
	
	@FindBy(xpath = "//*[@id='my-nav']/div/div/a")
	public WebElement studentname;
	

	@FindBy(xpath = "//*[@id='my-nav']/div/div/div/button[2]")
	public WebElement Logout;
	

}
