package testcasesPageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjectmodel.loginpageobject;

public class logintestcase {

	@Test
	public void login() throws InterruptedException

{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://phptravels.net/login");
	PageFactory.initElements(driver, loginpageobject.class);
loginpageobject.username(driver).sendKeys("user@phptravels.com");
Thread.sleep(5000);
loginpageobject.password(driver).sendKeys("demouser");
Thread.sleep(5000);

loginpageobject.submitbutton(driver).click();
//Thread.sleep(3000);


	//username.sendKeys("user@phptravels.com");
//	pass.sendKeys("demouser");

//button.click();
driver.quit();
}
}
