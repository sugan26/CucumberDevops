package demoPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/s1.feature",
//glue="packagename"
plugin="json:target\\jsonreport.jason")
public class MyRunner {

}
