package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutScheduleVisit {
	WebDriver driver;

	public AboutScheduleVisit(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[2]")
	public WebElement About;

	@FindBy(xpath = "//a[text()='Schedule Visit']")
	public WebElement ScheduleVisit;
	
	

}
