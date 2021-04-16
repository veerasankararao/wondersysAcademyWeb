package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBIndustry {
	WebDriver driver;

	public KBIndustry(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[1]")
	public WebElement KB;
		
	@FindBy(xpath = "//*[@id='my-nav']/ul/li[4]/div/a[4]")
	public WebElement iIot;
	
	
	

}
