package step_definitions;

import com.team.git.practice.utilities.ConfigurationReader;
import com.team.git.practice.utilities.Driver;
import org.junit.After;
import org.junit.Before;


public class Hooks {

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigurationReader.get("url"));
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
