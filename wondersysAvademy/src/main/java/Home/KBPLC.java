package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBPLC {
	WebDriver driver;

	public KBPLC(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[1]")
	public WebElement KB;
		
	@FindBy(xpath = "//*[@id='my-nav']/ul/li[4]/div/a[2]")
	public WebElement Plc;
	

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div[1]/h2")
	public WebElement plcDelta;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div[2]/a")
	public WebElement plcDeltareadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/h2")
	public WebElement plcABB;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/a")
	public WebElement plcABBreadmore;
	
	
}
