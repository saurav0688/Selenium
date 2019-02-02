package saurav.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;  
  
public class Third {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
          
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\abhishek.kumar1\\Desktop\\Java1\\driver\\geckodriver.exe");
       
        FirefoxOptions capa = new FirefoxOptions();
        capa.setCapability("marionette", true);
       
        WebDriver driver = new FirefoxDriver(capa);
        driver.navigate().to("https://www.facebook.com");
        System.out.println("The current URL= "+driver.getCurrentUrl());
        System.out.println("The page title= "+driver.getTitle());
        driver.close();
  
    }  
  
}  