package Project.Building_a_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTripProject {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asus\\eclipse\\Selenium_project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='uid']")).sendKeys("Mahesh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='uid']")).clear();
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
		driver.navigate().to("https://mail.google.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
//		driver.navigate().forward();
		Thread.sleep(4000);
		WebElement unTB = driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[8]/a"));

		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		System.out.println("Height : " +un_height);
		System.out.println("Weidth : " +un_width);
		System.out.println("X-Corr : " +un_x);
		if(unTB.isDisplayed()) {
			System.out.println("WebElement is Displaced");
		}else{
			System.out.println("WebElement is not Displaced");
		};
		unTB.getText();
		unTB.getTagName();
		unTB.getCssValue(null);
		Thread.sleep(4000);
		driver.quit();
	}
}
