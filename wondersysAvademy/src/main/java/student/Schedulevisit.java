package student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedulevisit {
	WebDriver driver;
	 
	 public Schedulevisit(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	 
	 @FindBy(xpath = "(//a[@id='navbarDropdown1'])[2]")
		public WebElement About;

		@FindBy(xpath = "//a[text()='Schedule Visit']")
		public WebElement ScheduleVisit;
		
		@FindBy(id = "name")
		public WebElement SVname;
		
		@FindBy(id = "email")
		public WebElement SVEmail;
		
		@FindBy(id = "phone_no")
		public WebElement SVPhonenumber;
		
		@FindBy(id = "date")
		public WebElement SVSelectdate;
		
		@FindBy(id = "time")
		public WebElement SVSlectTime;
		
		@FindBy(id = "message")
		public WebElement SVMassagebox;
		
		@FindBy(xpath = "//*[text()='Submit']")
		public WebElement SVsubmit;
		


		

}
