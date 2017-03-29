package com.githubauto.webdriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class GithubUserHomeTest {

  /**
   * 1. Open Browser, go to Github.com 2. Verify the title
   * 
   * Automation: Using page model actions > drive the pages > 1. Create a webdriver(firefox/chrome)
   * 2. Create a githubhome page instance and pass driver to it 3. GithubHomePage.load > will load
   * Github Home page 4. GithubHomePage.getTitle -> get the title 2. Load apge using "driver.get"
   * method get the title verify the title
   *
   */
  public WebDriver driver;
  private GitHubUserHomePage userHomePage;


  public GithubUserHomeTest() {
    driver = WebdriverBuilder.getdriver();
  }
  
  @Ignore
  public void setup(){
    System.out.println("Run precondition");
    driver.manage().deleteAllCookies();
    
    GitHubHomePage home = new GitHubHomePage(driver);
    home.load();
    driver.manage().window().maximize();
    GitHubLoginPage loginPage= home.signin();
    userHomePage = loginPage.login("wipauto123", "Github123$");
   }

  @Ignore
  public void verifysignIn() {
    }
  
  

  @Test
  public void verifyStartProject() {
    System.out.println("Run precondition");
    driver.manage().deleteAllCookies();
    
    GitHubHomePage home = new GitHubHomePage(driver);
    home.load();
    driver.manage().window().maximize();
    GitHubLoginPage loginPage= home.signin();
    userHomePage = loginPage.login("wipauto123", "Github123$");
    CreateRepositoryPage repoPage =  userHomePage.locateStartButton();
    GitHubSetupPage setupPage = repoPage.createNewRepository();
    setupPage.clickSettings();
   
   
    
    //startbtn.click();
    
    
    
    //public void deleteRepository(){
      
    //}
    
    /*@After
    driver.manage().deleteAllCookies();*/
    
   
    //return new CreateRepositoryPage(driver);


  }



  /*
   * on home page, signIn() > Githubloginpage on git hubLoginpage, login(string username, string
   * password) GithubUserHomepage
   */


}

// Go to home page
// 2: Search with some quesry, it should navigate to Search results page
// 3. on search results page assert
// 4. create method getAllProjectTitles should return all titles



// create a search results page
// on search results page; assert with how many results you have

// search mthos returns search results page
// get number of results
// 1. get number of results (count of results)
// 2. print all the result titles[list of title] getProjectTitles



// create a webdriverbuilder
// create a instance get driver
// that driver should return a static variable
// go through java singleton class and try to implement for webdriver builder
