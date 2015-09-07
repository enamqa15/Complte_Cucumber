package cucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "json:target/cucumber.json" }, 
features = { "src/cucumber/" },
glue={"southwest","com.stepdefination","com.gmailTest"}

)
public class RunnerTest {

}
