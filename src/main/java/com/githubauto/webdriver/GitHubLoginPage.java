package com.githubauto.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubLoginPage {

  private WebDriver driver;

  public GitHubLoginPage(WebDriver driver) {
    this.driver = driver;
  }

  public GitHubUserHomePage login(String user, String passcode) {
    GitHubUserHomePage userHomePage = new GitHubUserHomePage(driver);
    driver.navigate().to("https://github.com/login");
    WebElement username = driver.findElement(By.id("login_field"));
    username.sendKeys(user);
    WebElement pwd = driver.findElement(By.id("password"));
    pwd.sendKeys(passcode);
    driver.findElement(By.name("commit")).click();
    return userHomePage;
  }

}
