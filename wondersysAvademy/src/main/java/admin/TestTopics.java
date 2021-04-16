package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestTopics {
	WebDriver driver;

	public TestTopics(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[4]/a")
	public WebElement TestTopics;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div")
	public WebElement TestTopicName;
	
	@FindBy(id = "name")
	public WebElement TTName;
	
	@FindBy(id = "count")
	public WebElement TTQuestioncount;
	
	@FindBy(xpath = "//*[text()='ADD TEST TOPIC']")
	public WebElement TTaddTestTopics;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement TTshowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement TTSearch;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[1]")
	public WebElement TTedit;
	
	@FindBy(id = "editname")
	public WebElement TTeditName;
	
	@FindBy(id = "editcount")
	public WebElement TTeditcount;
	
	@FindBy(id = "submitedits")
	public WebElement TTupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTestTopic']/div/div/div[1]/button/span")
	public WebElement TTcloseupdate;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[2]")
	public WebElement KBDeleteTesttopic;
	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement TTPreviousbutton;
	
	@FindBy(id = "laravel_datatable_next")
	public WebElement TTNextbutton;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement TTcurrentpage;
	

	
	

}
