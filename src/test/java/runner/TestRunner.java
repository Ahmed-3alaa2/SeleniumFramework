package runner;

import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"C:\\Users\\3alaa2\\eclipse-workspace\\Taf\\src\\test\\java\\features"},glue= {"steps"}
,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class TestRunner extends TestBase {

}
