package org.runewriters.stepdefs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty","html:target/testReport.html", "json:target/jsonReport.json"},
        //tags can be used to run tests for different type of users
        //one user at a time
        tags = "@user1",
        publish = true
)
public class TestRunner { }
