/*package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinition {
WebDriver driver;	
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","//home//sbv6//Downloads//chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/index.html");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^title of login page is free CRM$")
	public void title_of_login_page_is_free_CRM() throws Throwable {
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	    
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)   {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	    
	}
	
	@Then("^user clicks on login$")
	public void user_clicks_on_login() {
		//driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginBtn);
	    
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String title= driver.getTitle();
		System.out.println("Homepage title" + title);
		Assert.assertEquals("CRMPRO", title);	    
	    
	}
	
	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page() throws InterruptedException  {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	   
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealData) throws InterruptedException  {
		List<List<String>> dealValues = dealData.raw();
		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")).click();
		Thread.sleep(2000);
	   
	}
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	    
	}

}*/
