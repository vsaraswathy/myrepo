package org.apache.maven.Test_Project.Test_Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/edureka/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		//System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");
		driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("vijayalakshmi.saraswathy@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("chellakutty");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("Login");
        Thread.sleep(6000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Log Out")).click();
        System.out.println("Logout successfully");
        Thread.sleep(2000);
        driver.quit();
	}

}
