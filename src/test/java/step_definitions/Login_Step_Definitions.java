package step_definitions;

import com.team.git.practice.pages.LoginPage;
import com.team.git.practice.utilities.ConfigurationReader;
import com.team.git.practice.utilities.Driver;
import com.team.git.practice.utilities.UI_Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Login_Step_Definitions {

LoginPage loginPage = new LoginPage();

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {

	}
		@When("user logs in as a librarian")
		public void user_logs_in_as_a_librarian() {
			Map<String, String> creds = UI_Helper.fetchCredentials();

			loginPage.login(
					creds.get("email"),
					creds.get("password")
			);
		}
		@Then("user should be on the dashboard page")
		public void user_should_be_on_the_dashboard_page() {
			String expectedUrl =
					ConfigurationReader.properties.getProperty("dashboardUrl");

			String actualUrl = Driver.getDriver().getCurrentUrl();

			Assert.assertEquals(expectedUrl, actualUrl);
		}
		@Then("user account name should be displayed")
		public void user_account_name_should_be_displayed() {
			String expectedName =
					ConfigurationReader.properties.getProperty("librarian.name");

		}
}
