package selprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

//import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;


public class facegenielogin {
	String info[][]=null;
	WebDriver driver;
@DataProvider(name="testdata")

	public String[][] getdata() throws BiffException, IOException
	{
		info=getexceldata();
		return info;
	}


public String[][]  getexceldata() throws BiffException, IOException
{
	FileInputStream file1=new FileInputStream("D:\\selenium lib\\excel\\facegenietest.xls");
	Workbook wb=Workbook.getWorkbook(file1);
	Sheet s1=wb.getSheet(0);
	int rows=s1.getRows();
	int col=s1.getColumns();
	String data[][]=new String[rows-1][col];
	
	
	for (int i=1;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
			 data[i-1][j]=s1.getCell(j,i).getContents();
		}

	}		
return data;
}
@BeforeTest
void initialize()
{
System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
 driver=new ChromeDriver();
}
@AfterTest
 void quitdriver1() {
	// TODO Auto-generated method stub
driver.quit();
}
	
@Test(dataProvider = "testdata")
	public void login(String email,String pwd) throws InterruptedException
{
	//System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	driver.get("https://facegenie-ams-school.web.app");
	WebElement email1=driver.findElement(By.id("email"));
	email1.sendKeys(email);
	//to display the testcases
Thread.sleep(20);
	//email1.sendKeys("testing@gmail.com");
	WebElement pass=driver.findElement(By.id("password"));
	//pass.sendKeys("testing@123");
	pass.sendKeys(pwd);
	Thread.sleep(20);

	WebElement button=driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div/div/div[2]/div/div[1]/form[2]/button"));
button.click();
Thread.sleep(20);

////*[@id="root"]/div/div[1]/div/div/div[2]/div/div[1]/form[2]/button
}
}
