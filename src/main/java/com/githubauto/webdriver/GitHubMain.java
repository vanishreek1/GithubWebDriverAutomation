package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GitHubMain {

  public static void main(String[] args) {
    String userid = "testuser";
    String pw = "password";
    System.setProperty("webdriver.gecko.driver", "/Users/vanishree/Downloads/geckodriver");
    WebDriver driver = new FirefoxDriver();
    GitHubHomePage homePage = new GitHubHomePage(driver);
    GitHubLoginPage loginPage = homePage.signin();
    loginPage.login(userid, pw);

  }

}
