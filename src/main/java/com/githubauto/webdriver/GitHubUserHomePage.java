package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GitHubUserHomePage {
  private WebDriver driver;

  public GitHubUserHomePage(WebDriver driver) {
    this.driver = driver;
    // TODO Auto-generated constructor stub
  }

  public CreateRepositoryPage locateStartButton() {
    driver.findElement(By.cssSelector(".btn.shelf-cta.ml-3")).click();
    return new CreateRepositoryPage(driver);

  }
  
  

}
