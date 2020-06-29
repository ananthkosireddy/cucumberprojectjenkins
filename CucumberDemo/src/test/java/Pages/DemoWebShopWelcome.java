package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DemoWebShopWelcome {

	@FindBy(how=How.LINK_TEXT,using="Register")
	public static WebElement registerLink;
	@FindBy(how=How.LINK_TEXT,using="Log in")
	public static WebElement loginLink;
	@FindBy(how=How.LINK_TEXT,using="Log out")
	public static WebElement logoutLink;
}
