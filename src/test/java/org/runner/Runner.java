package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace"
		+ "\\CucumberProject\\src\\test\\resources\\"
		+ "Feature Files", glue = "org.stepdef",dryRun = false, tags = {"@smoke"})

public class Runner {
	
	

}