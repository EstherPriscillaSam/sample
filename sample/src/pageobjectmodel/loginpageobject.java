package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import java.sql.Driver;

public class loginpageobject {
//username passwordsubmit button
	public static  WebElement username(WebDriver driver)
	{
	return	 driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));

	}
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));

	}
	public static WebElement submitbutton(WebDriver driver)
	{
		return  driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));

	}
}
