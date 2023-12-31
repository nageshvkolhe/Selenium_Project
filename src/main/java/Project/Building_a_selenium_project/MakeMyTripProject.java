package Project.Building_a_selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		System.out.println("Height : " + un_height);
		System.out.println("Weidth : " + un_width);
		System.out.println("X-Corr : " + un_x);
		if (unTB.isDisplayed()) {
			System.out.println("WebElement is Displaced");
		} else {
			System.out.println("WebElement is not Displaced");
		}
		;
//		unTB.getText();
//		unTB.getTagName();
//		unTB.getCssValue(null);+
		Thread.sleep(4000);
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		// entering text into the focussed element
		driver.switchTo().activeElement().sendKeys("Appium");
		Thread.sleep(2000);
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		Thread.sleep(4000);

		WebElement red = driver.findElement(By.xpath("//input[@name='color' and @value='red']"));
		if (red.isDisplayed()) {
			System.out.println("Red checkbox is Displayed. Return: " + red.isDisplayed());
		} else {
			System.out.println("Red checkbox is not Displayed. Return: " + red.isDisplayed());
			driver.quit();
		}

		if (red.isSelected()) {
			System.out.println("Red checkbox is selected. Return: " + red.isSelected());
		} else {
			System.out.println("Red checkbox is not selected. Return: " + red.isSelected());

		}

		WebElement opera = driver.findElement(By.xpath("//input[@name='browser' and @value='Opera']"));
		// Check radio button opera is selected or not.
		if (opera.isSelected()) {
			System.out.println("Radio button opera is selected. Return: " + opera.isSelected());
		} else {
			System.out.println("Radio button opera is not selected. Return: " + opera.isSelected());
		}
//		driver.get("https://www.geeksforgeeks.org/");
//
//		WebElement java = driver.findElement(By.xpath("//*[@id=\"hslider\"]/li[6]/a"));
//
//		// Create a reference
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		// Call the JavascriptExecutor methods
//		js.executeScript("arguments[0].click();", java);

//***********iFrame
		int size = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i <= size; i++) {
			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
			driver.switchTo().defaultContent();

		}
		driver.get("https://www.browserstack.com/");

		Actions a = new Actions(driver);

		// Double click on element

		WebElement trialaction = driver.findElement(By.xpath("//a[@id='free-trial-link-anchor']"));
		a.doubleClick(trialaction).perform();
		Thread.sleep(4000);

		driver.get("https://demo.guru99.com/test/selenium-xpath.html");

		Thread.sleep(4000);
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"java_technologies\"]/li[8]/a"));

		// mouse hover on "java_technologies" menu
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		menu.click();
		Thread.sleep(4000);
		// ********** Select Class ***********
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		WebElement developers_dropdown = driver.findElement(By.id("developers-menu-toggle"));
		Select objSelect = new Select(developers_dropdown);
		objSelect.selectByIndex(2);
		Thread.sleep(3000);
		driver.get("https://www.browserstack.com/");
		WebElement solutions_dropdown = driver.findElement(By.id("solutions-menu-dropdown"));
		Select solutions = new Select(solutions_dropdown);
		solutions.selectByValue("4000");
		Thread.sleep(3000);
		WebElement solutions_d = driver.findElement(By.id("solutions-menu-dropdown"));
		Select s1 = new Select(solutions_d);
		s1.selectByVisibleText("Geolocation Testing");
		Thread.sleep(4000);
//		driver.close();
		driver.quit();
	}
}
