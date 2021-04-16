package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyKnowledgeBased {
	WebDriver driver;

	public CompanyKnowledgeBased(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[7]/a")
	public WebElement CompanyKnowledgeBased;

	@FindBy(xpath = "//*[text()='ADD COMPANY KNOWLEDGE BASE']")
	public WebElement CKBAddcompany;
	
	@FindBy(id = "knowledge_base_topic_id")
	public WebElement CKBSelectcompanyBasedtopic;
	
	@FindBy(xpath = "addname")
	public WebElement CKBNameofCompany;

	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement CKBAddDetails;
	
	@FindBy(xpath = "addcompanylogo")
	public WebElement CKBAddCompanyLogo;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement CKBsubmitbutton;

	@FindBy(xpath = "//*[@id='addKnowledgeBase']/div/div/div[1]/button/span")
	public WebElement CKBaddclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_length']/label/select")
	public WebElement CKBShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement CKBSearchoption;

	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[3]/a[1]")
	public WebElement CKBedit;
	
	@FindBy(id = "editknowledge_base_topic_id")
	public WebElement CKBeditknowledgebasetopic;
	
	@FindBy(id = "editname")
	public WebElement CKBeditname;

	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement CKBeditDetails;
	
	@FindBy(id = "editcompanylogo")
	public WebElement CKBeditcompanylogo;
	
	@FindBy(id = "submitedits")
	public WebElement CKBupdatebutton;

	@FindBy(xpath = "//*[@id='editKnowledgeBase']/div/div/div[1]/button/span")
	public WebElement CKBcloseButton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[3]/a[2]")
	public WebElement CKBDeleteTopic;
	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement CKBPreviousbutton;

	@FindBy(id = "laravel_datatable_next")
	public WebElement CKBNextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement CKBCurrentpage;
	
	
	
}
