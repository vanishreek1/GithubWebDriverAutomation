package com.githubauto.webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
  private static final By RESULT_LOCATOR = By.cssSelector("div.codesearch-results ul li");
  private static By TEXT_LOCATOR = By.tagName("h3");
  private final WebDriver driver;

  public SearchResultsPage(WebDriver driver) {

    this.driver = driver;
  }


  public int  getResultsCount() {
    By resultsLocator = By.cssSelector("div.codesearch-results ul li");
    return driver.findElements(RESULT_LOCATOR).size();
  }
  
  public List<String> getprojectTiles(){
    By resultsLocator = By.cssSelector("div.codesearch-results ul li");
    List<WebElement> resultsEles = driver.findElements(RESULT_LOCATOR);
    List<String> titles = new ArrayList<>();
    for (WebElement resEle : resultsEles){
    String title = resEle.findElement(TEXT_LOCATOR).getText();
    titles.add(title);
  }
  return titles;
  }
  
  public Result getResult(int index){
      WebElement resultEle = driver.findElements(RESULT_LOCATOR).get(index);
      return new Result(resultEle);
    
  }
  public class Result{
    WebElement resultEle;
    public Result(WebElement resultEle) {
      this.resultEle = resultEle;
      
    }
    
    public String getProjectTitle(){
      return resultEle.findElement(TEXT_LOCATOR).getText();
  }
  }
}
