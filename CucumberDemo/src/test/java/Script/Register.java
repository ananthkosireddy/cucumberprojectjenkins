package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Register {
	WebDriver driver;
	public Register() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("the url of the testmeapp reg is {string}")
	public void the_url_of_the_testmeapp_reg_is(String string) {
		 driver.get(string);
	}
	
	@When("the user clicks on signup button")
	public void the_user_clicks_on_signup_button() {
	    driver.findElement(By.xpath("//a[contains(.,'SignUp')]")).click();
	}
	
	@When("user enters username for registration {string}")
	public void user_enters_username_for_registration(String username) {
		driver.findElement(By.name("userName")).sendKeys(username);
	}

	@When("user enters firstname for registration {string}")
	public void user_enters_firstname_for_registration(String firstname) {
		driver.findElement(By.name("firstName")).sendKeys(firstname);
	}

	@When("user enters lastname for registration {string}")
	public void user_enters_lastname_for_registration(String lastname) {
		driver.findElement(By.name("lastName")).sendKeys(lastname);
	}

	@When("user enters password for registration {string}")
	public void user_enters_password_for_registration(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("user enters confirmpassword for registration {string}")
	public void user_enters_confirmpassword_for_registration(String confirmpassword) {
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmpassword);
	}

	@When("user enters choose gender for registration")
	public void user_enters_choose_gender_for_registration() {
		driver.findElement(By.xpath("//span[contains(.,'Male')]")).click();
	}

	@When("user enters email for registration {string}")
	public void user_enters_email_for_registration(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}

	@When("user enters mobilenumber for registration {string}")
	public void user_enters_mobilenumber_for_registration(String mobilenumber) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mobilenumber);
	}

	@When("user enters dob for registration {string}")
	public void user_enters_dob_for_registration(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}

	@When("user enters addresss for registration {string}")
	public void user_enters_addresss_for_registration(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}

	@When("user selects securityquestion for registration")
	public void user_selects_securityquestion_for_registration() {
		Select securityQ=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		securityQ.selectByIndex(0);
	}

	@When("user enters answer for registartion {string}")
	public void user_enters_answer_for_registartion(String answer) {
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(answer);
	}

	@When("user submits register button")
	public void user_submits_register_button() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();	
	}

	@Then("user registered successfully")
	public void user_registered_successfully() {
		boolean flag=driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).isDisplayed();
	    Assert.assertTrue(flag);
	}

}
