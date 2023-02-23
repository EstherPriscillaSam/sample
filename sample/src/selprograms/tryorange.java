package selprograms;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tryorange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//usernamElement.sendKeys("hello");
	//	WebElement formElement=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form"));
		/*@FindBy(xpath="//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
		public static WebElement  usernamElement;*/
		//driver.manage().timeouts().wait(300);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		WebElement usernamElement=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

		usernamElement.sendKeys("hello");

	}
	

}
