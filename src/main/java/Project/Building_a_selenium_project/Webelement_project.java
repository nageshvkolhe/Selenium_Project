package Project.Building_a_selenium_project;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Webelement_project {
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asus\\eclipse\\Selenium_project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://gada-electronics-ecommerce.vercel.app/products");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'sign up')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jethalal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gada");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jethalal.gada@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwordMain']")).sendKeys("Babita123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwordConfirm']")).sendKeys("Babita123");
		Thread.sleep(2000);
		Robot r = new Robot();
		//Move mouse in X & Y Direction
		r.mouseMove(0, 500);
		driver.findElement(By.xpath("//button[contains(text(),'Create New Account')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jethalal.gada@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Babita123");
		Thread.sleep(2000);	
		r.mouseMove(0, 500);
		driver.findElement(By.xpath("//body/div[@id='root']/main[1]/main[1]/div[1]/form[1]/button[1]")).click();
		Thread.sleep(2000);
		
		

		
		
		
		
		
//		driver.findElement(By.id("user-name")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		Thread.sleep(2000);
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
//		driver.findElement(By.id("login-button")).click();

		//// ******* CSSselector Syntax
		//// tagName[attributeName="AttributeValue"] here tagName is not mandatory
		//// <input type=”textbox” id= “ID123” class = “inputText” value=”Login”>

		//driver.findElement(By.cssSelector("input[id='ID123']"));
		//driver.findElement(By.cssSelector("input[class='inputText']"));
		//// *** Multiple Attributes
		//driver.findElement(By.cssSelector(" input*type=’textbox’+*id=’ID123’+*class=’inputText’+*value=’Login’+"));
		Thread.sleep(2000);

		driver.close();

	}

}
