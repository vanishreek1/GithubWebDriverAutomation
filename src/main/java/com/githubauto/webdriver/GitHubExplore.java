package com.githubauto.webdriver;

import org.openqa.selenium.WebDriver;

public class GitHubExplore {
  
  private WebDriver driver;
  
  public void GitHubExplore(WebDriver driver){
    this.driver=driver;
  }
  
  
  public String getTitle(){
    return driver.getTitle();
    
    
  }
}
