package admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainingList {
	WebDriver driver;

	public TrainingList(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver1, this);
	}

	@FindBy(xpath = "//*[@id='app']/div[2]/div[1]/div[4]/div/ul/li[2]/a")
	public WebElement TrainingList;
	
	@FindBy(xpath = "//*[@id='app']/div[2]/div[2]/div/div[1]/div/div/div")
	public WebElement TrainingName;
	
	//Add training list
	@FindBy(xpath = "//*[text()='ADD TRAINING']")
	public WebElement TLAddTraining;
	
	@FindBy(id = "addname")
	public WebElement TLAddname;
	
	@FindBy(id = "addstartdate")
	public WebElement TLAddStartdate;
	
	@FindBy(id = "addenddate")
	public WebElement TLAddEndDate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLAddDetailsOfTraining;
	
	@FindBy(id = "addprice")
	public WebElement TLAddPrice;
	
	@FindBy(id = "addcoph")
	public WebElement TLAddoordinatornumber;
	
	@FindBy(xpath = "//*[@id='add-training']/div/div[3]/div[3]/button")
	public WebElement TLSubmitButton;
	
	@FindBy(xpath = "//*[@id='addTraining']/div/div/div[1]/button/span")
	public WebElement TLCloseButton;
	
	//show Entries
	@FindBy(name = "laravel_datatable_length")
	public WebElement TLshowentries;
	
	//Search option
	@FindBy(xpath = "//*[@id='laravel_datatable_filter']/label/input")
	public WebElement TLSearch;
	
	//java Edit
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[7]/a[1]")
	public WebElement TLJavaEdit;
	
	@FindBy(id = "editname")
	public WebElement TLjavaeditname;
	
	@FindBy(id = "editstartdate")
	public WebElement TLjavaedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLjavaeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLjavaeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLjavaEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLjavacoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLjavaupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLjavaeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[1]/td[7]/a[2]")
	public WebElement TLjavaDelete;
	
	//c++ 
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[2]/td[7]/a[1]")
	public WebElement TLCPlusEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLCPlusedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLCPluseditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLCPluseditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLCPlusEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLCPluscoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLCPlusupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLCPluseditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[2]/td[7]/a[2]")
	public WebElement TLCPlusDelete;
	
	
	//c language
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[3]/td[7]/a[1]")
	public WebElement TLClanguageEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLClanguageedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLClanguageeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLClanguageeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLClanguageEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLClanguagecoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLClanguageupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLClanguageeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[3]/td[7]/a[2]")
	public WebElement TLClanguageDelete;
	
	
	//SQL
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[4]/td[7]/a[1]")
	public WebElement TLSQLEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLSQLedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLSQLeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLSQLeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLSQLEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLSQLcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLSQLupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLSQLeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[4]/td[7]/a[2]")
	public WebElement TLSQLDelete;
	
	//MSOffice
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[5]/td[7]/a[1]")
	public WebElement TLMSOfficeEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLMSOfficeedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLMSOfficeeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLMSOfficeeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLMSOfficeEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLMSOfficecoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLMSOfficeupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLMSOfficeeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[5]/td[7]/a[2]")
	public WebElement TLMSOfficeDelete;
	
	
	//SDLC
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[6]/td[7]/a[1]")
	public WebElement TLSDLCEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLSDLCedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLSDLCeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLSDLCeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLSDLCEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLSDLCcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLSDLCupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLSDLCeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[6]/td[7]/a[2]")
	public WebElement TLSDLCDelete;
	
	//Wonderware products
	@FindBy(xpath = "//*[@id=\"laravel_datatable\"]/tbody/tr[7]/td[7]/a[1]")
	public WebElement TLWonderwareProductsEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLWonderwareProductsedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLWonderwareProductseditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLWonderwareProductseditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLWonderwareProductsEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLWonderwareProductsCcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLWonderwareProductsupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLWonderwareProductseditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[7]/td[7]/a[2]")
	public WebElement TLWonderwareProductsDelete;
	
	
	//python
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[8]/td[7]/a[1]")
	public WebElement TLPythonEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLPythonedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLPythoneditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLPythoneditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLPythonEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLPythoncoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLPythonupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLPythoneditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[8]/td[7]/a[2]")
	public WebElement TLPythonDelete;
	
	
	//React
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[9]/td[7]/a[1]")
	public WebElement TLReactEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLReactedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLReacteditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLReacteditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLReactEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLReactcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLReactupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLReacteditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[9]/td[7]/a[2]")
	public WebElement TLReactDelete;
	
	
	//J2EEE
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[10]/td[7]/a[1]")
	public WebElement TLJ2EEEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLJ2EEedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLJ2EEeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLJ2EEeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLJ2EEEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLJ2EEcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLJ2EEupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLJ2EEeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[10]/td[7]/a[2]")
	public WebElement TLJ2EEDelete;
	

	//Ruby onTails
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[11]/td[7]/a[1]")
	public WebElement TLRubyOntailsEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLRubyOntailsedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLRubyOntailseditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLRubyOntailseditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLRubyOntailsEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLRubyOntailscoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLRubyOntailsupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLRubyOntailseditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[11]/td[7]/a[2]")
	public WebElement TLRubyOntailsDelete;
	
	
	//SAP
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[12]/td[7]/a[1]")
	public WebElement TLSAPEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLSAPedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLSAPeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLSAPeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLSAPEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLSAPcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLSAPupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLSAPeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[12]/td[7]/a[2]")
	public WebElement TLSAPDelete;
	
	//Veena training
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[13]/td[7]/a[1]")
	public WebElement TLVeenaEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLVeenaedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLVeenaeditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLVeenaeditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLVeenaEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLVeenacoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLVeenaupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLVeenaeditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[13]/td[7]/a[2]")
	public WebElement TLVeenaDelete;
	
	//Test
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[14]/td[7]/a[1]")
	public WebElement TLTestEdit;
	
	@FindBy(id = "editstartdate")
	public WebElement TLTestedistartdate;
	
	@FindBy(id = "editenddate")
	public WebElement TLTesteditenddate;
	
	@FindBy(xpath = "//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
	public WebElement TLTesteditDetailsOfTraining;
	
	@FindBy(id = "editprice")
	public WebElement TLTestEditprice;
	
	@FindBy(id = "editcoph")
	public WebElement TLTestcoordinatornumber;
	
	@FindBy(id = "submitedits")
	public WebElement TLTestupdatebutton;
	
	@FindBy(xpath = "//*[@id='editTraining']/div/div/div[1]/button/span")
	public WebElement TLTesteditclosebutton;
	
	@FindBy(xpath = "//*[@id='laravel_datatable']/tbody/tr[14]/td[7]/a[2]")
	public WebElement TLTestDelete;
	
	
	
	
	//previous button
	@FindBy(id = "laravel_datatable_previous")
	public WebElement TLprevoiusbutton;
	
	//Page 1
	@FindBy(xpath = "//*[@id='laravel_datatable_paginate']/span/a[1]")
	public WebElement TLPage1;
	
	//page 2
	@FindBy(xpath = "//*[@id='laravel_datatable_paginate']/span/a[2]")
	public WebElement TLpage2;
	
	//Nextbutton
	@FindBy(id = "laravel_datatable_next")
	public WebElement TLNextButton;
	
	
	
	
	
	
	

}
