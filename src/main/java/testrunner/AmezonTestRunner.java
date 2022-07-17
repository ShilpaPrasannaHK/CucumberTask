package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



//@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = "./src/main/java/Feature/",
			glue = {"stepDefinition","CucumberHooks"},
			plugin = {"pretty"}
			
		
		)
public class AmezonTestRunner extends AbstractTestNGCucumberTests {

}
