package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {
	
	WebDriver driver;
	
	@Before("@register")
	public void web() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Given("^I navigate to Register page$")
	public void i_navigate_to_register_page() {

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

	}

	@When("^I enter the below details$")
	public void i_enter_the_below_details(DataTable dataTable) {

        Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
        
        driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstname"));
        driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastname"));
        driver.findElement(By.id("input-email")).sendKeys(dataMap.get("email"));
        driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
        driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
        driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("password"));
		
	}

	@And("^I select the privacy policy option$")
	public void i_select_the_privacy_policy_option() {

        driver.findElement(By.name("agree")).click();
		
	}

	@And("^I click on Continue button$")
	public void i_click_on_continue_button() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@After("@register")
	public void closure() {
		driver.quit();
	}
	

}
