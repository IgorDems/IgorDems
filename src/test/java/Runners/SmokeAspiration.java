package Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "src/test/java/com/aspiration/cucumber/steps/serenity/StepsDefinition.java",
        plugin = {"pretty","summary"},
        strict = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/aspiration/aspiration.feature"
)
public class SmokeAspiration {
}
