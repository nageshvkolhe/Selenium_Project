package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider

	public Object[][] dataBank() {
		Object[][] facebookdata = new Object[6][2];
		// Parameters ===> Column //Data ---> Rows
		facebookdata[0][0] = "username1@gmail.com";
		facebookdata[0][1] = "Password1";
		facebookdata[1][0] = "username2@gmail.com";
		facebookdata[1][1] = "Password2";
		facebookdata[2][0] = "username3@gmail.com";
		facebookdata[2][1] = "Password3";
		facebookdata[3][0] = "username4@gmail.com";
		facebookdata[3][1] = "Password4";
		return facebookdata;
	}

	@Test(groups = "test", dataProvider = "dataBank")
	public void TestChrome(String uname, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers1/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(password);
		System.out.println("Sign In Successfully ....");
		driver.close();
	}
}
