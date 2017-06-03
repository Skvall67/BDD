import org.junit.After;

import static StepsDefinition.CommonStepDefinitions.getDriver;

/**
 * Created by drygoi on 20.05.17.
 */
public class SetUpClass {

    @After
    public static void dispose(){
        getDriver().quit();
        getDriver().close();
    }

}
