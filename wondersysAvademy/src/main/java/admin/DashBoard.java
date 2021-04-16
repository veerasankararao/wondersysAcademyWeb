package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	WebDriver driver;

	public DashBoard(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[1]/a")
	public WebElement Dashboard;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement DashboardName;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[1]/div/div")
	public WebElement DStudent;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[2]/a/div")
	public WebElement DTraining;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[3]/a/div")
	public WebElement DLiveProjects;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[4]/a/div")
	public WebElement DTestTopics;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[5]/a/div")
					
	public WebElement DTestQuestions;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[6]/a/div")
	public WebElement DCompanyKnowledgeBase;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[7]/a/div")
	public WebElement DRegularKnowledgebases;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[8]/a/div")
	public WebElement DWhitepapers;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[2]/div[9]/a/div")
	public WebElement DArticles;
	

}
