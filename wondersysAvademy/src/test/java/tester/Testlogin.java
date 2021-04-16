package tester;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Home.AboutGallery;
import Home.LoginPage;
import Home.LogoAndHome;
import admin.Changepassword;







public class Testlogin {
	public static void main(String[] args) throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\wondersysAvademy-20210414T093311Z-001\\wondersysAvademy\\drivers\\chromedriver89.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.wondersysacademy.com/qa/");
	driver.manage().window().maximize();
	Thread.sleep(3000);

/*
	driver.findElement(By.xpath("//*[@id='my-nav']/ul/li[2]/a")).click();
	Thread.sleep(3000);
	WebElement header=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div[1]/h2"));
	String s=header.getText();
	if (s.equalsIgnoreCase("java")) {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div[2]/a")).click();
		System.out.println("your select the "+s);
		
	} else {
		System.out.println("wrong data");
	}
	
		*/
	LoginPage lp=new LoginPage(driver);
	lp.getLoginhome().click();
	lp.getLoginemail().sendKeys("admin@wondersysacademy.com");
	lp.getLoginpassword().sendKeys("password");
	lp.getLoginsignin().click();
	
	
	Changepassword c=new Changepassword(driver);
	c.getWondersysAcademy().click();
	Thread.sleep(3000);
	c.getChangePassword().click();
	
	
	
	}
	
}

