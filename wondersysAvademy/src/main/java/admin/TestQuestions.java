package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestQuestions {
	WebDriver driver;

	public TestQuestions(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[5]/a")
	public WebElement TestQuestions;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement TQTestQuestionName;
	
	@FindBy(xpath = "//*[text()='ADD TEST QUESTION']")
	public WebElement TQAddTestQuestion;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TQEnterQuestion;
	
	@FindBy(id = "addoption1")
	public WebElement TQoption1;
	
	@FindBy(id = "addoption2")
	public WebElement TQoption2;
	
	@FindBy(id = "addoption3")
	public WebElement TQOption3;
	
	@FindBy(id = "addoption4")
	public WebElement TQoption4;
	
	@FindBy(id = "testtopic")
	public WebElement TQSelectQuestionTopic;
	
	@FindBy(id = "addanswer")
	public WebElement TQSelectAnswer;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement TQSubmitquestion;
	
	@FindBy(xpath = "//*[@id='addTestQuestion']/div/div/div[1]/button/span")
	public WebElement TQAddQuestionClosebutton;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement TQShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement TQSearchoption;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[1]")
	public WebElement TQedit;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TQEditQuestion;
	
	@FindBy(id = "editoption1")
	public WebElement TQEditOption1;
	
	@FindBy(id = "editoption2")
	public WebElement TQEditOption2;
	
	@FindBy(id = "editoption3")
	public WebElement TQEditOption3;
	
	@FindBy(id = "editoption4")
	public WebElement TQEditOption4;

	@FindBy(id = "edittesttopic")
	public WebElement TQedittesttopic;
	
	@FindBy(id = "editanswer")
	public WebElement TQeditAnswer;
	
	@FindBy(id = "submitedits")
	public WebElement TQeditsubmits;
	
	@FindBy(xpath = "//*[@id='editTestQuestion']/div/div/div[1]/button/span")
	public WebElement TQeditclosebutton;
	

	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[4]/a[2]")
	public WebElement KBDeletetestQuestion;

	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement TQPreviouspage;
	
	@FindBy(id = "laravel_datatable_next")
	public WebElement TQNextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement TQCurrentpage;
	
	
}
