package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KBScada{
	WebDriver driver;

	public KBScada(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[1]")
	public WebElement KB;

	@FindBy(xpath = "//*[@id='my-nav']/ul/li[4]/div/a[1]")
	public WebElement scada;

	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div[1]/h2")
	public WebElement scadasiemens;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div[2]/div[2]/a")
	public WebElement scadasiemansreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/h2")
	public WebElement scadawonderware;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div[2]/div[2]/a")
	public WebElement scadawonderwarereadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[2]/div[1]/h2")
	public WebElement scadawipro;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div[2]/div[2]/a")
	public WebElement scadawiproreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div[2]/div[1]/h2")
	public WebElement scadatata;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div[2]/div[2]/a")
	public WebElement scadatatareadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div[2]/div[1]/h2")
	public WebElement scadaReliance;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div[2]/div[2]/a")
	public WebElement scadareliancereadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div[2]/div[1]/h2")
	public WebElement scadaHoneywell;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div[2]/div[2]/a")
	public WebElement scadaHoneywellreadmore;
	
	@FindBy(xpath ="/html/body/div[2]/div/div/div[7]/div/div[2]/div[1]/h2")
	public WebElement scadaABB;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div[2]/div[2]/a")
	public WebElement scadaABBreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div[2]/div[1]/h2")
	public WebElement scadaDelta;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div[2]/div[2]/a")
	public WebElement scadaDeltareadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div[2]/div[1]/h2")
	public WebElement scadaSchneiderElectric;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div[2]/div[2]/a")
	public WebElement scadaSchneiderElectricreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div[2]/div[1]/h2")
	public WebElement scadaAllenBradly;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div[2]/div[2]/a")
	public WebElement scadaAllenBradlyreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div[2]/div[1]/h2")
	public WebElement scadaGeneralElectric;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div[2]/div[2]/a")
	public WebElement scadaGeneralElectricreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div[2]/div[1]/h2")
	public WebElement scadaMitsubishiElectric;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div[2]/div[2]/a")
	public WebElement scadaMitsubishiElectricreadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div[2]/div[1]/h2")
	public WebElement scadaTest;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div[2]/div[2]/a")
	public WebElement scadaTestreadmore;
	
	

}
