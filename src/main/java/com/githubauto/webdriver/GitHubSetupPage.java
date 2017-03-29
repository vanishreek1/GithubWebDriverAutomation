package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GitHubSetupPage {
  private WebDriver driver;
  
  public GitHubSetupPage(WebDriver driver) {
    this.driver = driver;
  }
  
  public void clickSettings(){
    driver.findElement(By.xpath("//*[@id='js-repo-pjax-container']/div[1]/div[2]/nav/a[5]")).click();
    driver.manage().window().maximize();
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(1500,500)", "");
    driver.findElement(By.xpath("//*[@id='options_bucket']/div[5]/div/button[3]")).click();
    
    
  }
  
  
  

}
