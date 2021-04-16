package student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taketest {
	WebDriver driver;
	 
	 public Taketest(WebDriver driver1) {
	 this.driver=driver1;
	 PageFactory.initElements(driver1, this);
	 
	 }
	
	
	@FindBy(xpath = "//*[text()='Take Test']")
	public WebElement Taketest;
	
	
	@FindBy(id = "test-topic-9")
	public WebElement TTprogrammablecheckbox;
	
	@FindBy(id = "test-topic-10")
	public WebElement TTSCADAcheckbox;
	
	@FindBy(id = "test-topic-11")
	public WebElement TTControlSystemcheckbox;
	
	@FindBy(id = "test-topic-74")
	public WebElement TTJavacheckbox;
	
	@FindBy(id = "test-topic-76")
	public WebElement TTPHPcheckbox;
	
	@FindBy(id = "test-topic-77")
	public WebElement TTJavaScriptcheckbox;
	
	@FindBy(id = "test-topic-78")
	public WebElement TTPythoncheckbox;
	
	@FindBy(id = "test-topic-79")
	public WebElement TTSQLcheckbox;
	
	@FindBy(id="test-topic-80")
	public WebElement TTReactcheckbox;
	
	@FindBy(id = "test-topic-81")
	public WebElement TTCcheckbox;
	
	@FindBy(id = "test-topic-82")
	public WebElement TTCSScheckbox;
	
	@FindBy(id = "test-topic-83")
	public WebElement TTHTMLcheckbox;
	
	@FindBy(id = "test-topic-84")
	public WebElement TTRubycheckbox;
	
	@FindBy(id = "test-topic-85")
	public WebElement TTSeleniumcheckbox;
	
	@FindBy(id = "take-test")
	public WebElement TTTaketest;
	/*
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
	@FindBy(id = "")
	public WebElement TTcheckbox;
	
*/
	
}
