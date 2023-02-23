package testcasesPageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pageobjectmodel.loginpageobject2;

public class newlogin {
//this program linked with login page object2
	String data[][]=null;
WebDriver driver;
	@DataProvider(name="logindata")
	public String [][] logindataprovider() throws BiffException, IOException
	{
		data=getexceldata();
		return data;
	}
	public String[][] getexceldata() throws BiffException, IOException
	{
		FileInputStream file1=new FileInputStream("D:\\selenium lib\\excel\\testdata.xls");
		Workbook wb1=Workbook.getWorkbook(file1);
		Sheet sheet1=wb1.getSheet(0);
		int rowcount=sheet1.getRows();
		int columncount=sheet1.getColumns();
		String testdata[][]=new String[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<columncount;j++)
			{
			testdata[i-1][j]=	sheet1.getCell(j,i).getContents();
			}
		}
	return testdata;
	}
	@BeforeTest
	public void BeforeTest()
	{System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
	 driver=new ChromeDriver();
	}
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}
	

	
	@Test(dataProvider ="logindata" )
	public void  loginwithusernameandpassword(String username1,String pwd) throws InterruptedException
	{
	//	System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
	 
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//driver.wait(500);
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		//WebElement usernamElement=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

//WebElement usernamElement=driver.findElement(By.name("username"));
//usernamElement.sendKeys(username1);
//Thread.sleep(300);
//WebElement pass=driver.findElement(By.name("password"));
//pass.sendKeys(pwd);
//Thread.sleep(300);

//WebElement button=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
//button.click();

		//xpath="//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"
//driver.quit();
	PageFactory.initElements(driver, loginpageobject2.class);
		loginpageobject2.username.sendKeys(username1);
		loginpageobject2.password.sendKeys(pwd);
		loginpageobject2.submitbutton.click();
//driver.quit();
////*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button
			
		}
	}

