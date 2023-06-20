package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Omayologin {
	
	WebDriver driver;

	@Before("@login")
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Given("^I navigate to application URL$")
	public void i_navigate_to_application_url() {

		driver.get("http://omayo.blogspot.com/");

	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\" into the fields$")
	public void i_enter_username_as_someusername_and_password_as_somepassword_into_the_fields(String username, String password) {

		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);

	}

	@When("^I click on Login button$")
	public void i_click_on_login_button() {

		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

	@Then("^User should be able to login based on \"([^\"]*)\" login status$")
	public void user_should_be_able_to_login_based_on_expected_login_status(String expectedResult) {

		String actualResult = null;
		
		try {
			
			Alert alert = driver.switchTo().alert();
			
			if(alert.getText().contains("Error Password or Username")) {
				actualResult = "failure";
			}
			
		}
		catch(Exception e){
			
			actualResult = "success";
			
		}

		Assert.assertEquals(expectedResult, actualResult);
		
	}

	@After("@login")
	public void tearDown() {
		driver.quit();
	}
	
}
