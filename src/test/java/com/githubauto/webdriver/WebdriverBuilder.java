package com.githubauto.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBuilder {
  static WebDriver webDriver;

  public static WebDriver getdriver() {
    //String browser = System.getProperty("browser");
    //System.out.println(browser);
    if (webDriver == null) {
      webDriver = newChromeDriver(); 
      //webDriver =  newFirefoxDriver();
      }
    return webDriver;
  }

  private static WebDriver newChromeDriver(){
    System.setProperty("webdriver.chrome.driver", "/Users/vanishree/Downloads/chromedriver");
    WebDriver webDriver = new ChromeDriver();
    return webDriver;
    
  }
  private static WebDriver newFirefoxDriver(){
    System.setProperty("webdriver.gecko.driver", "/Users/vanishree/Downloads/geckodriver");
    //System.setProperty(webdriver.firefox., value)
    WebDriver webdriver = new FirefoxDriver();
    webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    webDriver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
    return webDriver;
  }
}
