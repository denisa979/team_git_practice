package step_definitions;
import io.cucumber.java.en.Given;

public class SmokeTest {

	@Given("I print {string}")
	public void i_print(String msg) {
		System.out.println("msg = " + msg);
	}
}
