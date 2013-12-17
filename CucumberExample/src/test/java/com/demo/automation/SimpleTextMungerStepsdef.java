package test.java.com.demo.automation;

import junit.framework.Assert;
import main.java.com.demo.automation.GoogleSearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleTextMungerStepsdef {
	
	
	private static GoogleSearchPage googlepage;	
	WebDriver driver;
	
	

  @Given("^a fresh browser window$")
  public void open_the_browser() {

	  this.driver=new InternetExplorerDriver();
	  Assert.assertNotNull(driver);

	  
  }

  @When("^I open \"([^\"]*)\"$")
  public void get_url(String url) {
	  driver.get(url);
  }

  @Then("^i can see the google home page$")
  public void I_can_see_the_google_home_page() {

	  googlepage=PageFactory.initElements(driver, GoogleSearchPage.class);
	  System.out.println("The Google Home page Objj"+ googlepage);
	  
  }
  
  
  
//  Given google home page
//  When I type "seleniumhq"
//  And I click search button
//  Then I can see the seleniumhq site in the result
  
  
  
  @Given("^google home page$")
  public void google_homepage() {
	  
	  Assert.assertNotNull(googlepage);

  }

  @When("^I type \"([^\"]*)\"$")
  public void i_type(String term) {
	  googlepage.enterSearchTerm(term);	  
  }
  
  
  @And("^I click search button$")
  public void i_click_search_button() {
	  googlepage.clickSearchButton();	  
  }
  
  
  
  

  @Then("^I can see the term seleniumhq in the result page$")
  public void I_can_see_the_term_seleniumhq_in_the_result_page() {

	  Assert.assertTrue(googlepage.isResultDisplayed());
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
}