 	package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBWhitePapers {
	WebDriver driver;

	public KBWhitePapers(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[1]")
	public WebElement KB;

	@FindBy(xpath = "//*[@id='my-nav']/ul/li[4]/div/a[6]")
	public WebElement Whitepaper;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[1]/h2")
	public WebElement WPBusinessContinuity;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[2]/a")
	public WebElement WPBusinessContinityReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[1]/h2")
	public WebElement WPVBRStudy;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/a")
	public WebElement WPVBRStudyReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/h2")
	public WebElement WPAgile;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/a")
	public WebElement WPAgileReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[1]/h2")
	public WebElement WPCouldTesting;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[2]/a")
	public WebElement WPCouldTestingReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[1]/h2")
	public WebElement WPContantMarkting;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[2]/a")
	public WebElement WPContantMarktingReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div/div[1]/h2")
	public WebElement WPTraceability;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div/div[2]/a")
	public WebElement WPTraceabilityReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[1]")
	public WebElement WPSeleniumAutomation;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[2]/a")
	public WebElement WPSeleniumAutomationReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[1]/h2")
	public WebElement WPPython;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[2]/a")
	public WebElement WPPythonReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[1]/h2")
	public WebElement WPjava;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[2]/a")
	public WebElement WPjavaReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[1]/h2")
	public WebElement WPHTML;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[2]/a")
	public WebElement WPHTMLReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[1]/h2")
	public WebElement WPAppium;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[2]/a")
	public WebElement WPAppiumReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[1]/h2")
	public WebElement WPCSS;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[2]/a")
	public WebElement WPCSSReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[1]/h2")
	public WebElement WPSass;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[2]/a")
	public WebElement WPSassReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[1]/h2")
	public WebElement WPPHP;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[2]/a")
	public WebElement WPPHPReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[15]/div/div/div[1]/h2")
	public WebElement WPSVG;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[15]/div/div/div[2]/a")
	public WebElement WPSVGReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[16]/div/div/div[1]/h2")
	public WebElement WPSQL;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[16]/div/div/div[2]/a")
	public WebElement WPSQLReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[17]/div/div/div[1]/h2")
	public WebElement WPVML;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[17]/div/div/div[2]/a")
	public WebElement WPVMLReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[18]/div/div/div[1]/h2")
	public WebElement WPRuby;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[18]/div/div/div[2]/a")
	public WebElement WPRubyReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[19]/div/div/div[1]/h2")
	public WebElement WPSGML;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[19]/div/div/div[2]/a")
	public WebElement WPSGMLReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[20]/div/div/div[1]/h2")
	public WebElement WPJavaScript;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[20]/div/div/div[2]/a")
	public WebElement WPJavaScriptReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[21]/div/div/div[1]/h2")
	public WebElement WPCplus;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[21]/div/div/div[2]/a")
	public WebElement WPCplusReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[22]/div/div/div[1]/h2")
	public WebElement WPJQuery;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[22]/div/div/div[2]/a")
	public WebElement WPjQueryReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[23]/div/div/div[1]/h2")
	public WebElement WPPerl;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[23]/div/div/div[2]/a")
	public WebElement WPPerlReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[24]/div/div/div[1]/h2")
	public WebElement WPCHash;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[24]/div/div/div[2]/a")
	public WebElement WPCHashReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[25]/div/div/div[1]/h2")
	public WebElement WPJSON;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[25]/div/div/div[2]/a")
	public WebElement WPJSonReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[26]/div/div/div[1]/h2")
	public WebElement WPCprogramming;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[26]/div/div/div[2]/a")
	public WebElement WPCProgrammingReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[27]/div/div/div[1]/h2")
	public WebElement WPAjax;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[27]/div/div/div[2]/a")
	public WebElement WPAjaxReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[28]/div/div/div[1]/h2")
	public WebElement WPHTTP;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[28]/div/div/div[2]/a")
	public WebElement WPHTTPReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[29]/div/div/div[1]/h2")
	public WebElement WPASP;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[29]/div/div/div[2]/a")
	public WebElement WPASpReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[30]/div/div/div[1]/h2")
	public WebElement WPSwift;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[30]/div/div/div[2]/a")
	public WebElement WPSwiftReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[31]/div/div/div[1]/h2")
	public WebElement WPCOBOL;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[31]/div/div/div[2]/a")
	public WebElement WPCOBOLReadmore;
	
	
	

	
	
	
	
	

}
