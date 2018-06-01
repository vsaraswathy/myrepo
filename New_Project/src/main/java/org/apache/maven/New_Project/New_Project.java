package org.apache.maven.New_Project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class New_Project {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		driver.get("http://localhost:8090/addressbook");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("A");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("B");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("989876549");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("test@edureka.co");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2015");
		driver.findElement(By.className("v-button-primary")).click();
		//Thread.sleep(5000);
		driver.quit();
	}

}
