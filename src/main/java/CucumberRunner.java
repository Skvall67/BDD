import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by drygoi on 20.05.17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
//        format={"pretty", "C:\\Users\\i.ruzhentsev\\workspaceidea\\BDD\\src\\target\\report.html"},
        features={"C:\\Users\\i.ruzhentsev\\workspaceidea\\BDD\\src\\main\\resources"},
        glue = {"StepsDefinition"},
        tags = {"@dlko9"}

)

public class CucumberRunner {
}
