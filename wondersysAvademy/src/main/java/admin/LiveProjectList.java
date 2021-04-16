package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveProjectList {
	WebDriver driver;

	public LiveProjectList(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[3]/a")
	public WebElement LiveProjectsList;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement LPLiveProjectName;
	
	
	@FindBy(xpath = "//*[text()='ADD LIVE PROJECT']")
	public WebElement LPAddLiveProjects;
	
	
	@FindBy(id = "addname")
	public WebElement LPAddName;
	
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement LPAddDetails;
	
	
	@FindBy(xpath = "//button[text()='Submit']")
	public WebElement LPSubmitbutton;
	
	
	@FindBy(xpath = "//*[@id='addLiveProject']/div/div/div[1]/button/span")
	public WebElement LPAddClosebutton;
	
	//show entries
	@FindBy(name = "laravel_datatable_length")
	public WebElement LPSelectEntries;
	
	//Search box
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement LPSearchbox;
	
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr/td[3]/a[1]")
	public WebElement LPEdit;
	
	
	@FindBy(id = "editname")
	public WebElement LPEditName;
	
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement LPTextupdate;
	
	@FindBy(id = "submitedits")
	public WebElement LPupdatebutton;
	
	
	@FindBy(xpath = "//*[@id='editLiveProject']/div/div/div[1]/button/span")
	public WebElement LPupdateclose;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr/td[3]/a[2]")
	public WebElement KBDeleteLiveProject;
	
	//page previous button
	@FindBy(xpath = "laravel_datatable_previous")
	public WebElement LPpreviousButton;
	
	//page Next button
	@FindBy(xpath = "laravel_datatable_next")
	public WebElement LPNext;
	
	//current page
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement LPCurrentpage;
	

}
