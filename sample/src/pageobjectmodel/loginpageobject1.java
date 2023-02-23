package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageobject1 {
	//using findby and pagefactory
	@FindBy(xpath="//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input")
public static  WebElement username;
	/*{
	return	 driver.findElement(By.xpath("//*[@id='fadein']/div[4]/div/div[2]/div[2]/div/form/div[1]/div/input"));

	}*/
	@FindBy(name="password")
	public static WebElement password;
	/*{
		return driver.findElement(By.name("password"));*/

	@FindBy(xpath="//*[@id=\\'fadein\\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
public static WebElement submitbutton;
/*	{
		return  driver.findElement(By.xpath("//*[@id=\'fadein\']/div[4]/div/div[2]/div[2]/div/form/div[3]/button"));

	}*/

}
