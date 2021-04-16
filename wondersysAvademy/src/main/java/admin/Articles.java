package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Articles {
	WebDriver driver;

	public Articles(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[9]/a")
	public WebElement Articles;

	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement ArticlesName;
	
	@FindBy(xpath = "//*[text()='ADD ARTICLE']")
	public WebElement ARAddArticles;
	
	@FindBy(id = "addname")
	public WebElement ARAddName;
	
	@FindBy(id = "addauthor")
	public WebElement ARAddauthor;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement ARaddDetails;
	
	@FindBy(id = "adddate")
	public WebElement ARaddDate;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement ARSumitbutton;
	
	@FindBy(xpath = "//*[@id='addArticle']/div/div/div[1]/button/span")
	public WebElement ARcloseaddpage;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement ARSelectShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement ARSearchOption;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[5]/a[1]")
	public WebElement AREdit;
	
	@FindBy(id = "editname")
	public WebElement AReditname;
	
	@FindBy(id = "editauthor")
	public WebElement AReditauthor;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement AReditdetails;
	
	@FindBy(id = "editdate")
	public WebElement AReditdate;
	
	@FindBy(id = "submitedits")
	public WebElement ARupdatebutton;
	
	@FindBy(xpath = "//*[@id='editArticle']/div/div/div[1]/button/span")
	public WebElement AReditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[5]/a[2]")
	public WebElement ARdeletetopic;
	
	@FindBy(id = "laravel_datatable_previous")
	public WebElement ARpreviouspage;
	
	@FindBy(id = "laravel_datatable_next")
	public WebElement ARnextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement ARcurrentpage;
	

}
