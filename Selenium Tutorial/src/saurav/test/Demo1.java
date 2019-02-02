package saurav.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void verifyHomepageTitle() {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\abhishek.kumar1\\Desktop\\Java1\\driver\\geckodriver.exe");

		FirefoxOptions capa = new FirefoxOptions();
		capa.setCapability("marionette", true);

		WebDriver driver = new FirefoxDriver(capa);

		driver.navigate().to("http://demo.guru99.com/test/radio.html");

		assertEquals(driver.getCurrentUrl(), "http://demo.guru99.com/test/radio.html");
		assertEquals(driver.getTitle(), "Radio Button & Check Box Demo");
		
		driver.findElement(By.xpath(".//input[@type='checkbox' and @value='checkbox2']")).click();
		driver.findElement(By.xpath(".//input[@type='radio' and @value='Option 3']")).click();
		
	}

	@Test
	public void f() {

	}
}
