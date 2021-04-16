package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoAndHome{
	WebDriver driver;

	public LogoAndHome(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//img[@class='logo']")
	public WebElement logo;
	
	@FindBy(xpath = "//*[@id='my-nav']/ul/li[1]/a")
	public WebElement Home;
	
	
		

	public WebElement getHome() {
		return Home;
	}


	public WebElement getLogo() {
		return logo;
	}


	public WebDriver getDriver() {
		return driver;
	}



}
