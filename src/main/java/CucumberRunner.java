import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by drygoi on 20.05.17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:/home/drygoi/IdeaProjects/CucumberForPractise/src/target/report.html"},
        features={"/home/drygoi/IdeaProjects/CucumberForPractise/src/main/resources"},
        glue = {"StepsDefinition"},
        tags = {"@YandexMarketTest"}

)

public class CucumberRunner {
}
