package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectParticularTraining {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ECLIPSE\\eclipse\\wondersysAvademy\\drivers\\chromedriver89.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.wondersysacademy.com/qa/");
		driver.manage().window().maximize();


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
		
			
		
		
	}

}
