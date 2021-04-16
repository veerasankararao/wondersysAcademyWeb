package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalleryList {
	
	WebDriver driver;

	public GalleryList(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[9]/a")
	public WebElement Gallerylist;

	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement GalleryListName;
	
	@FindBy(xpath = "//*[text()='ADD Gallery']")
	public WebElement GLAddGallery;
	
	@FindBy(id = "addname")
	public WebElement GLAddName;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement GLaddDetails;
	
	@FindBy(id = "addFile")
	public WebElement GLaddimage;
	
	@FindBy(id = "//*[@id='filesContainer']/input[1]")
	public WebElement GLuploadimage1;
	@FindBy(id = "//*[@id='filesContainer']/input[2]")
	public WebElement GLuploadimage2;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public WebElement GLSumitbutton;
	
	@FindBy(xpath = "//*[@id='addGallery']/div/div/div[1]/button/span")
	public WebElement GLcloseaddpage;
	
	@FindBy(name = "laravel_datatable_length")
	public WebElement GLSelectShowEntries;
	
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement GLSearchOption;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[3]/a[1]")
	public WebElement GLEdit;
	
	@FindBy(id = "editname")
	public WebElement GLeditname;
	
	@FindBy(xpath = "//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement GLeditdetails;
	
	@FindBy(xpath = "//*[@id='edit-gallery']/div/div[3]/div[1]/a")
	public WebElement GLdeletePreviousimage;
	
	@FindBy(xpath = "editFile")
	public WebElement GLEditImage;
	
	@FindBy(xpath = "//*[@id='editfilesContainer']/input")
	public WebElement GLeditnewimage;
		
	@FindBy(id = "submitedits")
	public WebElement GLupdatebutton;
	
	@FindBy(xpath = "//*[@id='editGallery']/div/div/div[1]/button/span")
	public WebElement GLeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[3]/a[2]")
	public WebElement GLdeletetopic;
	
	@FindBy(id = "lGLavel_datatable_previous")
	public WebElement GLpreviouspage;
	
	@FindBy(id = "lGLavel_datatable_next")
	public WebElement GLnextpage;
	
	@FindBy(xpath = "//*[@class='paginate_button current']")
	public WebElement GLcurrentpage;
	


}
