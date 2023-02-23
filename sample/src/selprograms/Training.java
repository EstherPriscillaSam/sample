package selprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training
{
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/alert.xhtml");
WebElement alertbox1=driver.findElement(By.id("j_idt88:j_idt91"));
alertbox1.click();
Thread.sleep(3000);
//switch control to alert ok
//interface called alert in selenium 
Alert alertI=driver.switchTo().alert();
alertI.accept();//to press ok

//2.for confirmation alert


WebElement alertbox2=driver.findElement(By.id("j_idt88:j_idt93"));
alertbox2.click();
Thread.sleep(3000);
Alert alertI1=driver.switchTo().alert();
alertI1.dismiss();//to press ok
Thread.sleep(3000);
//Alert alertI2=driver.switchTo().alert();
//alertI2.dismiss();
WebElement promptbox=driver.findElement(By.id("j_idt88:j_idt104"));
promptbox.click();
//Thread.sleep(3000);
Alert promptalertI1=driver.switchTo().alert();
promptalertI1.sendKeys("Esther");
Thread.sleep(3000);
promptalertI1.accept();

WebElement maxWin=driver.findElement(By.id("j_idt88:j_idt111"));
maxWin.click();

Alert alertI3=driver.switchTo().alert();

	Thread.sleep(3000);
		driver.manage().window().maximize();
	}		
}

