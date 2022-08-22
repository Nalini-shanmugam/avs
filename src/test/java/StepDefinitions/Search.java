package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	WebDriver driver = new ChromeDriver();
	@Given("browser window  is open")
	public void browser_window_is_open() throws InterruptedException {
System.setProperty("webdriver.chromedriver", "chromedriver.exe");

		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        
	}
	
	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin"); 
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		Thread.sleep(3000);
        
	}

	@And("click login")
	public void click_login() throws InterruptedException {
   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
   Thread.sleep(3000);
   
	}

	@When("user enter employee name and Id")
	public void user_enter_employee_name_and_Id() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("aaabbbccc");
		Thread.sleep(3000);
        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("03200911");
		Thread.sleep(3000);
        
	}

	@Then("results are shown below")
	public void results_are_shown_below() {
		System.out.println("First link clicked successfully");
		driver.close();
		driver.quit();
	}

}
