package Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trainingpage {
	WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public Trainingpage(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	 @FindBy(xpath = "//*[@id='my-nav']/ul/li[2]/a")
	 public WebElement trainingpage;
	
	 //This all java related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[1]/h2")
	 public WebElement trainingjava;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div/div/div[2]/a")
	 public WebElement trainingjavareadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingjavacoordinatornumber;

	 
	 //This all C++ related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[1]/h2")
	 public WebElement trainingCplus;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/a")
	 public WebElement trainingcplusreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingcpluscoordinatornumber;
	 
	 //This all C language related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[1]/h2")
	 public WebElement trainingC;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[3]/div/div/div[2]/a")
	 public WebElement trainingcreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingccoordinatornumber;
	 
	 //This all SQL related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[1]/h2")
	 public WebElement trainingSQL;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[4]/div/div/div[2]/a")
	 public WebElement trainingSQLreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingSQLcoordinatornumber;
	 
	 
	 //This all MS Office related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[1]/h2")
	 public WebElement trainingMSOffice;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[5]/div/div/div[2]/a")
	 public WebElement trainingMSOfficereadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingMSOfficecoordinatornumber;
	
	 //This all SDLC related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div/div[1]/h2")
	 public WebElement trainingSDLC;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[6]/div/div/div[2]/a")
	 public WebElement trainingSDLCreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingSDLCcoordinatornumber;	 
	 
	 //This all Wonderware Products related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[1]/h2")
	 public WebElement trainingwonderwareproducts;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[7]/div/div/div[2]/a")
	 public WebElement trainingwonderwareproductsreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingwonderwareproductscoordinatornumber;	 
	 
	 //This all python related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[1]/h2")
	 public WebElement trainingpython;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[8]/div/div/div[2]/a")
	 public WebElement trainingpythonreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingpythoncoordinatornumber;	 
	 
	 //This all React related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[1]/h2")
	 public WebElement trainingReact;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[9]/div/div/div[2]/a")
	 public WebElement trainingReactreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingReactcoordinatornumber;	 
	 
	 //This all J2EE related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[1]/h2")
	 public WebElement trainingJ2EE;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[10]/div/div/div[2]/a")
	 public WebElement trainingJ2EEreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingJ2EEcoordinatornumber;	 
	 
	 //This all Ruby related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[1]/h2")
	 public WebElement trainingRuby;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[11]/div/div/div[2]/a")
	 public WebElement trainingRubyreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingRubycoordinatornumber;	 
	 
	 //This all SAP related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[1]/h2")
	 public WebElement trainingSAP;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[12]/div/div/div[2]/a")
	 public WebElement trainingSAPreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingSAPcoordinatornumber;	 
	 
	 //This all Veena Training related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[1]/h2")
	 public WebElement trainingVeena;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[13]/div/div/div[2]/a")
	 public WebElement trainingVeenareadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingVeenacoordinatornumber;	 
	 
	 //This all Test related training page
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[1]/h2")
	 public WebElement trainingtest;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[14]/div/div/div[2]/a")
	 public WebElement trainingtestreadmore;
	 
	 @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/ul/li[4]/div[2]/span/a")
	 public WebElement trainingtestcoordinatornumber;	 
	 
	 
	 
}
