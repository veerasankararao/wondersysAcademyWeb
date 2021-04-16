package student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	 
	 public Dashboard(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	
	
	@FindBy(xpath = "//*[text()='Dashboard']")
	public WebElement Dashboard;
	
	
	@FindBy(xpath = "//*[text()='Restart Test']")
	public WebElement Restarttest;
	

}
