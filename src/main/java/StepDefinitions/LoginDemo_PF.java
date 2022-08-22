package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

public class LoginDemo_PF {
	WebDriver driver = new ChromeDriver();
	LoginPage_PF login;
	HomePage_PF home;

	@Given("browser is open")
	public void browser_is_open() {
		//System.setProperty("webdriver.chromedriver", "chromedriver.exe");
    	//driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {
		
		login = new LoginPage_PF(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		// driver.findElement(By.id("name")).sendKeys(username);
		// driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(2000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickOnLogin();
		// driver.findElement(By.id("login")).click();
	}


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		//home.checkLogoutIsDisplayed();
		 driver.findElement(By.id("logout")).isDisplayed();
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}




}


