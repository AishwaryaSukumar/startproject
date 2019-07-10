package org.test.cts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.xml.soap.Text;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Start {
	public static void main(String[] args) throws  InterruptedException, AWTException, IOException  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\zelenium\\dri\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
WebElement w1 = driver.findElement(By.id("day"));
Select S=new Select(w1);
S.selectByIndex(30);
boolean b = S.isMultiple();
System.out.println(b);
List<WebElement> allSelectedOptions = S.getAllSelectedOptions();

}
	

	
}