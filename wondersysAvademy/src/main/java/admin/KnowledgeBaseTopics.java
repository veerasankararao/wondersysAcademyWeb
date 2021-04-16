package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KnowledgeBaseTopics {
	WebDriver driver;

	public KnowledgeBaseTopics(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[6]/a")
	public WebElement KnowledgeBaseTopics;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement KBName;
	
	@FindBy(xpath = "//*[text()='ADD KNOWLEDGE BASE TOPIC']")
	public WebElement KBAddKnoledgeBase;
	
	@FindBy(id = "addname")
	public WebElement KBAddName;
	
	@FindBy(id = "companybased")
	public WebElement KBselectcompanybased;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement KBadddetails;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement KBSubmitbutton;
	
	@FindBy(xpath = "//*[@id='addKnowledgeBaseTopic']/div/div/div[1]/button/span")
	public WebElement KBClosebutton;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement KBShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement KBSearchoption;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[1]")
	public WebElement KBEdit;
	
	@FindBy(id = "editname")
	public WebElement KBEditName;
	
	@FindBy(id = "editcompanybased")
	public WebElement KBeditCompanyBased;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement KBEditDetails;
	
	@FindBy(id = "submitedits")
	public WebElement KBEditSubmits;
	
	@FindBy(xpath = "//*[@id='editKnowledgeBaseTopic']/div/div/div[1]/button/span")
	public WebElement KBeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[2]")
	public WebElement KBDeleteTopic;
	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement KBpreviouspage;
	
	@FindBy(id = "laravel_datatable_next")
	public WebElement KBNextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement KBcurrentpage;
	
	
	
	

}
