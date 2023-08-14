package Project.Building_a_selenium_project;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class MavenProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		// ** setting the path of the gecko driver executable
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\asus\\eclipse\\Selenium_project\\Driver\\geckodriver.exe");
		// ** Launch the firefox browser
		WebDriver driver = new FirefoxDriver();
		// setting the path of the chrome driver executable
		// System.setProperty("webdriver.chrome.driver",
              // "C:\\Users\\asus\\eclipse-Rutuja_java\\com\\target\\Driver\\chromedriver_1.exe");
		// ** Launch the Chrome browser 
		// WebDriver driver = new ChromeDriver();
		
		// ** Enter the url
		driver.get("https://github.com/mozilla/geckodriver/releases");
		Thread.sleep(10000);
		// *********** Navigation Interface ***************
		
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(200);
		driver.navigate().refresh();
		// Get the title of the google page and print it on the console
		String title = driver.getTitle();
		System.out.println("The title of the page is :" + title);
		// Get the URL of the google page and print it on the console
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The URL of the page is :" + currentUrl);
		// Get the source code of the google page and print it on the console
		// String pageSource = driver.getPageSource();
		// System.out.println("the source code of the page is :" + pageSource);
		
		//************ TakeScreenshot Interface ************
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String date = d.toString();
		String date2 = date.replaceAll(":", "_");
        System.out.println(date2);
		File destFile = new File("C:\\Users\\asus\\eclipse\\Selenium_project\\screenshot\\"+date2+"__page.png");
		Files.copy(srcFile,destFile);
		
		// Halt the program execution for 2 seconds
		Thread.sleep(5000);
		// Close the browser
		driver.close();
	}

}