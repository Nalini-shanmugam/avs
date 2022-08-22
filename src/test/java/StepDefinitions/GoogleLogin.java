package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GoogleLogin {
	WebDriver driver = new ChromeDriver();
	@Given("browser window is open")
	public void browser_window_is_open() {
		//System.setProperty("webdriver.chromedriver", "chromedriver.exe");

		
	//	driver.navigate().to("http://automationpractice.com/index.php");
	    
	}


	@And("user click signin button")
	public void user_click_signin_button() {
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
	}

	@When("user enter email address")
	public void user_enter_email_address() {
	   driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("nalinishan25@gmail.com");
	}

	@And("user click on create an account")
	public void user_click_on_create_an_account() {
	   driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	}



}
