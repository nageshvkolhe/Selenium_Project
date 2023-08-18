package Project.Building_a_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripProject {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asus\\eclipse\\Selenium_project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("Nagesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Kolhe@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='btnReset']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("Nageshk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("N@gesh2019");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='btnLogin']")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}
