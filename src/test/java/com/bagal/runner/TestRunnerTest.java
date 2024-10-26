package com.bagal.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",glue = {"com.bagal.stepDefinitions"})
public class TestRunnerTest extends AbstractTestNGCucumberTests {
}
