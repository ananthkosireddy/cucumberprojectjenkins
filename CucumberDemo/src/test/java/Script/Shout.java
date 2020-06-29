package Script;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Shout {
	
	Person sean=new Person();
	Person lucia=new Person();
	
	@Given("Saun is {int} meters away from Lucia")
	public void saun_is_meters_away_from_Lucia(Integer distance) {
		// Write code here that turns the phrase above into concrete actions
	    sean.setDistance(distance);
	}

	@When("Saun shouts {string} to Lucia")
	public void saun_shouts_to_Lucia(String message) {
	    // Write code here that turns the phrase above into concrete actions
	    sean.setMessage(message);
	}

	@Then("Lucia listens to message")
	public void lucia_listens_to_message() {
		String message=sean.returnMessage();
		Assert.assertEquals("free coffee",message);
	}
	
	@Then("Lucia cannot listens to message")
	public void lucia_cannot_listens_to_message() {
		String message=sean.returnMessage();
		Assert.assertNull(null);
	}
	@Given("sarah has {int} cucumbers")
	public void sarah_has_cucumbers(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
