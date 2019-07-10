package org.test.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr.Kamaraj\\eclipse-workspace\\zelenium\\dri\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
	w1.sendKeys("iphone6");
	WebElement w2 = driver.findElement(By.className("nav-input"));
	w2.click();
	WebElement w3 = driver.findElement(By.name("field-keywords"));
	w3.clear();
	WebElement w4 = driver.findElement(By.id("twotabsearchtextbox"));
	w4.sendKeys("samsung");
	WebElement w5 = driver.findElement(By.className("nav-input"));
	w5.click();
	WebElement w6 = driver.findElement(By.xpath("(//span[contains(text(),'Samsung Galaxy M20')])[1]"));
	w6.click();
	String pa = driver.getWindowHandle();
	System.out.println(pa);
	Set<String> chi = driver.getWindowHandles();
	System.out.println(chi);
	for(String x:chi) {
		if(!pa.equals(x)) {
		driver.switchTo().window(x);
		}
	}
	Set<String> chi1=driver.getWindowHandles();
	List<String> zx=new ArrayList<>();
	zx.addAll(chi1);
	WebElement w7 = driver.findElement(By.id("add-to-cart-button"));
	w7.click();
	
	
	
}

}
