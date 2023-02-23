package selprograms;

//import seleniumProg.ChromeDriver;
//import seleniumProg.Point;
//import seleniumProg.WebDriver;
//import seleniumProg.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class framesexample {
	public static void main(String args[])
	{
System.setProperty("webdriver.chrome.driver", "D:\\selenium lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://leafground.com/button.xhtml");
WebElement buttonExample=driver.findElement(By.id("j_idt88:j_idt94"));
Point buttonvalue=buttonExample.getLocation();
double xvalue=buttonvalue.getX();
double yvalue=buttonvalue.getY();
System.out.println(xvalue);
System.out.println(yvalue);
//driver.quit();
//confirming if the button is disabled
WebElement buttonExample2=driver.findElement(By.id("j_idt88:j_idt92"));
boolean isEnabled=buttonExample2.isEnabled();
System.out.println("is enabled"+isEnabled);
//finding the color of button
WebElement buttonExample3=driver.findElement(By.id("j_idt88:j_idt96"));
String color=buttonExample3.getCssValue("background-color");
System.out.println(color);

}
}
