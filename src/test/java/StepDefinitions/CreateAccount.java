package StepDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateAccount {
	WebDriver driver = new ChromeDriver();
	@Given("Chrome should launched and website is open")
	public void chrome_should_launched_and_website_is_open() {

		System.out.println("Inside Step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectPath);
		String filePath = new File("drivers/chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", filePath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
		
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	@And("enter the email id and click create a account")
	public void enter_the_email_id_and_click_create_a_account() {
		  driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("nalinishan25@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	}

	@When("user should fill the mandatory details")
	public void user_should_fill_the_mandatory_details() {
	  driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Nalini");
	  driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Shanmugam");
	  driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("Nalini@123");
	  
	}

	@And("Click on Register")
	public void click_on_Register() {
	   driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	}


}
