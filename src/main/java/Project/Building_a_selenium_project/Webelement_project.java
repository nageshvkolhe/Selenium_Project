package Project.Building_a_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelement_project {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asus\\eclipse\\Selenium_project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();

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
