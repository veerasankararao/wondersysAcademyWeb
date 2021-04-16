package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBArticles {
	WebDriver driver;

	public KBArticles(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[1]")
	public WebElement KB;
	
	@FindBy(xpath = "//*[@id='my-nav']/ul/li[4]/div/a[5]")
	public WebElement Articles;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[1]/h2")
	public WebElement ArticlesAnAI;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[2]/a")
	public WebElement ArticlesAnAIreadmore;
		
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[1]/h2")
	public WebElement Articlesoddlyvideos;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/a")
	public WebElement Articlesoddlyvideosreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/h2")
	public WebElement Articlescomputers;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/a")
	public WebElement Articlescomputersreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[1]/h2")
	public WebElement ArticlesStaticElectricity;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[2]/a")
	public WebElement ArticlesStaticElectricityreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[1]/h2")
	public WebElement ArticlesIncorporatingTechnology;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[2]/a")
	public WebElement ArticlesIncorporatingTechnologyreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[1]/h2")
	public WebElement ArticlesshortArticle;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[2]/a")
	public WebElement ArticlesshortArticlereadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[1]/h2")
	public WebElement ArticlesTechLife;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[2]/a")
	public WebElement ArticlesTechLifereadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[1]/h2")
	public WebElement ArticlesWilliamEnglish;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[2]/a")
	public WebElement ArticlesWilliamEnglishreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[1]/h2")
	public WebElement ArticlesAlexavulnerability;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[2]/a")
	public WebElement ArticlesAlexavulnerabilityreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[1]/h2")
	public WebElement ArticlesIntelTiger;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[2]/a")
	public WebElement ArticlesIntelTigerreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[1]/h2")
	public WebElement ArticlesComputerTechnology;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[2]/a")
	public WebElement ArticlesComputerTechnologyreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[1]/h2")
	public WebElement ArticlesTechnologydriven;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[2]/a")
	public WebElement ArticlesTechnologydrivenreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[1]/h2")
	public WebElement ArticlescivicTechnology;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[2]/a")
	public WebElement ArticlescivicTechnologyreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[15]/div/div/div[1]/h2")
	public WebElement Articles10rules;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[15]/div/div/div[2]/a")
	public WebElement Articles10rulesreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[16]/div/div/div[1]/h2")
	public WebElement ArticlesSmartbusiness;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[16]/div/div/div[2]/a")
	public WebElement ArticlesSmartbusinessreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[17]/div/div/div[1]/h2")
	public WebElement ArticlesTradinalReporting;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[17]/div/div/div[2]/a")
	public WebElement ArticlesTradinalreportingreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/d7iv[18]/div/div/div[1]/h2")
	public WebElement ArticlesRethinkinBusiness;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[18]/div/div/div[2]/a")
	public WebElement ArticlesRethinkingBusinessreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[19]/div/div/div[1]/h2")
	public WebElement ArticlesFieldLevelParadox;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[19]/div/div/div[2]/a")
	public WebElement ArticlesFieldLevelParadoxreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[20]/div/div/div[1]/h2")
	public WebElement Articlescoronavirus;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[20]/div/div/div[2]/a")
	public WebElement Articlescoronavirusreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[21]/div/div/div[1]/h2")
	public WebElement ArticlesCybersecurity;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[21]/div/div/div[2]/a")
	public WebElement ArticlesCybersecurityreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[22]/div/div/div[1]/h2")
	public WebElement ArticlesTop5mostviewedarticles;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[22]/div/div/div[2]/a")
	public WebElement ArticlesTop5mostviewedarticlesreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[23]/div/div/div[1]/h2")
	public WebElement ArticlesEthicsAndSystemDesign;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[23]/div/div/div[2]/a")
	public WebElement ArticlesEthicsAndSystemDesignreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[24]/div/div/div[1]/h2")
	public WebElement Articles5FutureTechnogies;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[24]/div/div/div[2]/a")
	public WebElement Articles5FutureTechnogiesreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[25]/div/div/div[1]/h2")
	public WebElement ArticlesBuyerIntent;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[25]/div/div/div[2]/a")
	public WebElement ArticlesBuyerIntentreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[26]/div/div/div[1]/h2")
	public WebElement ArticlesDigitalMarketing;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[26]/div/div/div[2]/a")
	public WebElement ArticlesDigitalMarketingreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[27]/div/div/div[1]/h2")
	public WebElement ArticlesGoogleMaps;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[27]/div/div/div[2]/a")
	public WebElement ArticlesGoogleMapsreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[28]/div/div/div[1]/h2")
	public WebElement ArticlesTrends;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[28]/div/div/div[2]/a")
	public WebElement ArticlesTrendsreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[29]/div/div/div[1]/h2")
	public WebElement ArticlesInstagram;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[29]/div/div/div[2]/a")
	public WebElement ArticlesInstagramreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[30]/div/div/div[1]/h2")
	public WebElement Articles7BiggestTechnology;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[30]/div/div/div[2]/a")
	public WebElement Articles7BiggestTechnologyreadmore;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[31]/div/div/div[1]/h2")
	public WebElement ArticlesComputerBasicsForKids;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[31]/div/div/div[2]/a")
	public WebElement ArticlesComputerBasicForKidsreadmore;
	
	
}
