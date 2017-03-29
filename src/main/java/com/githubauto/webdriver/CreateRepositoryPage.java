package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateRepositoryPage {
  private WebDriver driver;

  public CreateRepositoryPage(WebDriver driver) {
    this.driver = driver;
  }

  public  GitHubSetupPage createNewRepository() {
    driver.findElement(By.cssSelector("#repository_name")).sendKeys("Test13");
    driver.findElement(By.cssSelector(".btn.btn-primary.first-in-line")).click();
    return new GitHubSetupPage(driver);


  }

}
