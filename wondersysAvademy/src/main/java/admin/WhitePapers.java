package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhitePapers {
	WebDriver driver;

	public WhitePapers(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[8]/a")
	public WebElement Whitepapers;

	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement WhitePapaerName;
	
	@FindBy(xpath = "//*[text()='ADD WHITE PAPER']")
	public WebElement WPAddWhitepaper;
	
	@FindBy(id = "addname")
	public WebElement WPAddName;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement WPaddDetails;
	
	@FindBy(id = "addattachment")
	public WebElement WPTtachmet;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement WPSumitbutton;
	
	@FindBy(xpath = "//*[@id='addWhitePaper']/div/div/div[1]/button/span")
	public WebElement WPcloseaddpage;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement WPSelectShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement WPSearchOption;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[1]")
	public WebElement WPEdit;
	
	@FindBy(id = "editname")
	public WebElement WPeditname;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement WPeditdetails;
	
	@FindBy(id = "editattachment")
	public WebElement WPeditAttachment;
	
	@FindBy(id = "submitedits")
	public WebElement WPupdatebutton;
	
	@FindBy(xpath = "//*[@id='editWhitePaper']/div/div/div[1]/button/span")
	public WebElement WPeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[2]")
	public WebElement WPdeletetopic;
	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement WPpreviouspage;
	
	@FindBy(id = "laravel_datatable_next")
	public WebElement WPnextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement WPcurrentpage;
	
	

}
