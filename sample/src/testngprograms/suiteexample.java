package testngprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class suiteexample {
	WebDriver driver;
	long startTime;
long endtime;

@BeforeSuite
void launchbrowser()
{	 startTime=System.currentTimeMillis();

	System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
	driver=new ChromeDriver();

}
	@Test
	void opengoogle () 
	{
		driver.get("http://www.google.com");
		//driver.quit();
	}
	
	@Test
	void openyahoo() 
	{
		driver.get("http://www.yahoo.com");
		//driver.quit();

	}
	
	@AfterSuite
	void closebrowser()
	{
		driver.quit();
		endtime=System.currentTimeMillis();
	long totaltime=endtime-startTime;
	System.out.println(totaltime+"milliseconds");
	
	}
	

}
