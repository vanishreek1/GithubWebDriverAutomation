package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMain {

  public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "/Users/vanishree/Downloads/geckodriver");
    WebDriver driver = new FirefoxDriver();
    driver.navigate().to("https://github.com/");
    String appTitle = driver.getTitle();
    System.out.println("Application title is :: " + appTitle);
    driver.quit();

  }

}
