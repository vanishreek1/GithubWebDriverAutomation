package com.githubauto.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GitHubHomePage {
  private WebDriver driver;

  public GitHubHomePage(WebDriver driver) {
    // dr = driver;
    this.driver = driver;
  }

  public void load() {
    driver.navigate().to("https://github.com/");
  }

  public String getTitle() {
    return driver.getTitle();
  }

  public GitHubLoginPage signin() {
    driver.navigate().to("https://github.com");
    WebElement signin = driver.findElement(By.linkText("Sign in"));
    signin.click();
    return new GitHubLoginPage(driver);
  }

  public GitHubFeatures GotoFeatures() {
    driver.findElement(By.linkText("Features")).click();
    // featureLink.click();
    return new GitHubFeatures(driver);
  }



  public SearchResultsPage search(String query) {
    WebElement searchInput = driver.findElement(By.name("q"));
    searchInput.sendKeys(query);
    searchInput.click();
    searchInput.sendKeys(Keys.ENTER);
    return new SearchResultsPage(driver);

  }

  // public void SearchResults(){
  // List<WebElement> searchresultsList = driver.findElements(By.className("repo-list
  // js-repo-list"));
  // List<WebElement> searchresultsList = driver.findElements(By.cssSelector("*[class^='repo-list
  // js-repo-list']"));
  // List <WebElement> searchresultsList =
  // driver.findElements(By.cssSelector("div.codesearch-results li"));
  // System.out.println(Integer.toString(searchresultsList.size()));
  // for (WebElement results : searchresultsList) {
  // System.out.println(results);


  // }

}


