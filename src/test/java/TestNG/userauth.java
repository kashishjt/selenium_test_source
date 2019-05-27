package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class userauth {
	  WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("http://192.168.56.101:3001");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void verifyauth() {
	  driver.findElement(By.name("login")).sendKeys("devops");
	  driver.findElement(By.name("password")).sendKeys("test");
	  driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
  }
  
  @AfterMethod
  public void close() {
	  driver.close();
	}
}