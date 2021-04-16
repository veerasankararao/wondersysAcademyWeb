package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutGallery {
	
	WebDriver driver;

	public AboutGallery(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "(//a[@id='navbarDropdown1'])[2]")
	public WebElement About;

	@FindBy(xpath = "//a[text()='Gallery']")
	public WebElement Gallery;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div[1]/h2")
	public WebElement GWhitefield;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/a")
	public WebElement GWhitefieldReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div[1]/h2")
	public WebElement Gsarjapur;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/div/div[2]/a")
	public WebElement GsarjapurReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div/div/div[1]/h2")
	public WebElement GAnnaNagar;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[3]/div/div/div[2]/a")
	public WebElement GAnnaNagarReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[4]/div/div/div[1]/h2")
	public WebElement GKodabakkam;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[4]/div/div/div[2]/a")
	public WebElement GKodabakkamReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[5]/div/div/div[1]/h2")
	public WebElement GSaidapet;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[5]/div/div/div[2]/a")
	public WebElement GSaidapetReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[6]/div/div/div[1]/h2")
	public WebElement GKKNagar;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[6]/div/div/div[2]/a")
	public WebElement GKKNagarReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[7]/div/div/div[1]/h2")
	public WebElement GTambaram;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[7]/div/div/div[2]/a")
	public WebElement GTambaramReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[8]/div/div/div[1]/h2")
	public WebElement GGuindy;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[8]/div/div/div[2]/a")
	public WebElement GGuindyReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[9]/div/div/div[1]/h2")
	public WebElement GShenoynagar;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[9]/div/div/div[2]/a")
	public WebElement GShenoynagarReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[10]/div/div/div[1]/h2")
	public WebElement GRichmondTown;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[10]/div/div/div[2]/a")
	public WebElement GRichmondTownReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[11]/div/div/div[1]/h2")
	public WebElement GHSRlayout;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[11]/div/div/div[2]/a")
	public WebElement GHSRlayoutReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[12]/div/div/div[1]/h2")
	public WebElement GMalleswaram;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[12]/div/div/div[2]/a")
	public WebElement GMalleswaramReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[13]/div/div/div[1]/h2")
	public WebElement GBellandur;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[13]/div/div/div[2]/a")
	public WebElement GBellandurReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[14]/div/div/div[1]/h2")
	public WebElement GHEbbal;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[14]/div/div/div[2]/a")
	public WebElement GHebbalReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[15]/div/div/div[1]/h2")
	public WebElement GNehruplace;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[15]/div/div/div[2]/a")
	public WebElement GNehruplaceReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[16]/div/div/div[1]/h2")
	public WebElement GLajpatNagar;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[16]/div/div/div[2]/a")
	public WebElement GLajpatNagarReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[17]/div/div/div[1]/h2")
	public WebElement GGreenPark;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[17]/div/div/div[2]/a")
	public WebElement GGreenparkReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[18]/div/div/div[1]/h2")
	public WebElement GNaraina;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[18]/div/div/div[2]/a")
	public WebElement GNarainaReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[19]/div/div/div[1]/h2")
	public WebElement GRajendraPlace;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[19]/div/div/div[2]/a")
	public WebElement GRajendraplaceReadmore;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[20]/div/div/div[1]/h2")
	public WebElement GSundarNagar;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[20]/div/div/div[2]/a")
	public WebElement GSundarNagarReadmore;

	public WebDriver getDriver() {
		return driver;
	}

	
	public WebElement getAbout() {
		return About;
	}


	public WebElement getGallery() {
		return Gallery;
	}
	public WebElement getGWhitefield() {
		return GWhitefield;
	}
	public WebElement getGWhitefieldReadmore() {
		return GWhitefieldReadmore;
	}
	public WebElement getGsarjapur() {
		return Gsarjapur;
	}
	public WebElement getGsarjapurReadmore() {
		return GsarjapurReadmore;
	}
	public WebElement getGAnnaNagar() {
		return GAnnaNagar;
	}
	public WebElement getGAnnaNagarReadmore() {
		return GAnnaNagarReadmore;
	}
	public WebElement getGKodabakkam() {
		return GKodabakkam;
	}
	public WebElement getGKodabakkamReadmore() {
		return GKodabakkamReadmore;
	}
	public WebElement getGSaidapet() {
		return GSaidapet;
	}
	public WebElement getGSaidapetReadmore() {
		return GSaidapetReadmore;
	}
	public WebElement getGKKNagar() {
		return GKKNagar;
	}
	public WebElement getGKKNagarReadmore() {
		return GKKNagarReadmore;
	}
	public WebElement getGTambaram() {
		return GTambaram;
	}
	public WebElement getGTambaramReadmore() {
		return GTambaramReadmore;
	}
	public WebElement getGGuindy() {
		return GGuindy;
	}
	public WebElement getGGuindyReadmore() {
		return GGuindyReadmore;
	}
	public WebElement getGShenoynagar() {
		return GShenoynagar;
	}
	public WebElement getGShenoynagarReadmore() {
		return GShenoynagarReadmore;
	}
	public WebElement getGRichmondTown() {
		return GRichmondTown;
	}
	public WebElement getGRichmondTownReadmore() {
		return GRichmondTownReadmore;
	}
	public WebElement getGHSRlayout() {
		return GHSRlayout;
	}
	public WebElement getGHSRlayoutReadmore() {
		return GHSRlayoutReadmore;
	}
	public WebElement getGMalleswaram() {
		return GMalleswaram;
	}
	public WebElement getGMalleswaramReadmore() {
		return GMalleswaramReadmore;
	}
	public WebElement getGBellandur() {
		return GBellandur;
	}
	public WebElement getGBellandurReadmore() {
		return GBellandurReadmore;
	}
	public WebElement getGHEbbal() {
		return GHEbbal;
	}
	public WebElement getGHebbalReadmore() {
		return GHebbalReadmore;
	}
	public WebElement getGNehruplace() {
		return GNehruplace;
	}
	public WebElement getGNehruplaceReadmore() {
		return GNehruplaceReadmore;
	}
	public WebElement getGLajpatNagar() {
		return GLajpatNagar;
	}
	public WebElement getGLajpatNagarReadmore() {
		return GLajpatNagarReadmore;
	}
	public WebElement getGGreenPark() {
		return GGreenPark;
	}
	public WebElement getGGreenparkReadmore() {
		return GGreenparkReadmore;
	}
	public WebElement getGNaraina() {
		return GNaraina;
	}
	public WebElement getGNarainaReadmore() {
		return GNarainaReadmore;
	}
	public WebElement getGRajendraPlace() {
		return GRajendraPlace;
	}
	public WebElement getGRajendraplaceReadmore() {
		return GRajendraplaceReadmore;
	}
	public WebElement getGSundarNagar() {
		return GSundarNagar;
	}
	public WebElement getGSundarNagarReadmore() {
		return GSundarNagarReadmore;
	}
	

	
}
