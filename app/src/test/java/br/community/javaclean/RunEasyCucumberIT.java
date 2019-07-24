package br.community.javaclean;

import static io.github.osvaldjr.EasyCucumberRunner.GLUE_EASY_CUCUMBER;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.osvaldjr.EasyCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "json:target/jsonReports/cucumber.json"},
    features = {"src/test/resources/features"},
    glue = {GLUE_EASY_CUCUMBER},
    strict = true)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class RunEasyCucumberIT extends EasyCucumberRunner {
  @Test
  void shouldLoadContext() {}
}
