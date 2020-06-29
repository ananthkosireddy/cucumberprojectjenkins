package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	public login() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("the url is {string}")
	public void the_url_is(String string) {
	    driver.get(string);
	}

	@When("user clicks signin button")
	public void user_clicks_signin_button() {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user clicks signout button")
	public void user_clicks_signout_button() {
		driver.findElement(By.linkText("SignOut")).click();
	}

}
