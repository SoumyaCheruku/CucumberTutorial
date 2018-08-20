/*package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
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
	//^"([^\"]*)\"
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password)  {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	   
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
	
	@Then("^user navigate to new contact page$")
	public void user_navigate_to_new_contact_page() throws InterruptedException  {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^user provide \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_provide(String firstname, String lastname, String position) throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.id("company_position")).sendKeys(position);
		Thread.sleep(2000);
		
		
	    
	}

	@Then("^click on submit$")
	public void click_on_submit() throws InterruptedException  {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
		Thread.sleep(3000);
	    
	}
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	    
	}


}*/
