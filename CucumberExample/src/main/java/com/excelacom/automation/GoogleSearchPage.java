package main.java.com.excelacom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;







public class GoogleSearchPage {
	
	private final WebDriver driver;

	@FindBy(name = "q")
	private WebElement searchBox;
	
	
	@FindBy(name = "btnG")
	private WebElement searchButton;
	
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	private WebElement result;
	
	
	
	
	
	public GoogleSearchPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	
	public GoogleSearchPage clickSearchButton()
	{
		searchButton.click();
		return PageFactory.initElements(driver, this.getClass());

	}
	
	public void enterSearchTerm(String searchTerm)
	{
		/*try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		searchBox.click();
		searchBox.clear();
		searchBox.sendKeys(searchTerm);
	}
	
	public boolean isResultDisplayed()
	{
		try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return result.isDisplayed();
	}
	

}
