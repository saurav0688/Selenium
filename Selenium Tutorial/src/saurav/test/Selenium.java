package saurav.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
public static void main(String[] args) {
	

	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhishek.kumar1\\Desktop\\Java1\\chromedriver_win32\\chromedriver.exe");
	WebDriver chromedriver = new ChromeDriver();
	chromedriver.get("www.google.com");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*String s1= "Webdriver";
	System.out.println("Test Selenium");
	System.out.println(s1);*/
	
	//comment the above 2 lines and uncomment below 2 lines to use Chrome
	//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
}
}
