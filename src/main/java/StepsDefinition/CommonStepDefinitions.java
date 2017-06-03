package StepsDefinition;

import Tools.ActionTitle;
import Tools.AutotestError;
import Tools.PageTitle;
import Tools.ReflectionHelper;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * Created by drygoi on 20.05.17.
 */
public class CommonStepDefinitions {


    private static WebDriver driver;
    public static Class Init;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.firefox.marionette", "/home/drygoi/IdeaProjects/CucumberForPractise/src/geckodriver");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            driver = new FirefoxDriver();
        }
        return driver;
    }

    @Given("^open google site$")
    public void goGoGoogle() {
        getDriver();
        driver.get("http://www.google.com");
    }

    @Given("^открывает сайт \"([^\"]+)\"$")
    public void openSite(String siteAddress) {
        getDriver();
        driver.get(siteAddress);
    }


    @When("^находится на странице \"([^\"]+)\"$")
    public void userIsOnPage(String pageName) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Reflections reflections = new Reflections("PageObjectsPackage");
        Set<Class<?>> annotated = reflections.getTypesAnnotatedWith(PageTitle.class);
        if (annotated.size() > 1) {
            throw new AutotestError("Не уникальное имя страницы");
        }
        Init = annotated.iterator().next();
        Constructor cons = Init.getConstructor();
        cons.newInstance();
    }

    @When("^пользователь \\(([^\"]+)\\) \"([^\"]+)\"$")
    public void actionOneParam(String actionName, String param) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Assert.assertTrue("Не найдено метода с заданным названием : \"" + actionName + "\"",
                ReflectionHelper.getMethodsAnnotatedWith(Init, ActionTitle.class, actionName).size() != 0);
        for (Method m : ReflectionHelper.getMethodsAnnotatedWith(Init, ActionTitle.class, actionName)) {
            if (m.getParameterCount() == 1)
                m.invoke(Init.newInstance(), param);
            return;
        }
        throw new AutotestError("Отсутсвует метод с указанным колличеством параметров. \n" +
                "Имеется метод с колличеством параметров равным: " + 1);
    }

    @When("^пользователь \\(([^\"]+)\\) \"([^\"]+)\" \"([^\"]+)\"$")
    public void actionTwoParam(String actionName, String param, String param2) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Assert.assertTrue("Не найдено метода с заданным названием : \"" + actionName + "\"",
                ReflectionHelper.getMethodsAnnotatedWith(Init, ActionTitle.class, actionName).size() != 0);
        for (Method m : ReflectionHelper.getMethodsAnnotatedWith(Init, ActionTitle.class, actionName)) {
            if (m.getParameterCount() == 2)
                m.invoke(Init.newInstance(), param, param2);
            return;
        }
        throw new AutotestError("Отсутсвует метод с указанным колличеством параметров. \n" +
                "Имеется метод с колличеством параметров равным: " + 2);
    }


    @Then("^Проверяет окно ввода \"([^\"]*)\"$")
    public void checksInputWindow(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @When("^пользователь нажимает на кнопку \"([^\"]*)\"$")
    public void clickOnButton(String arg1) throws Throwable {
        WebElement d = driver.findElement(By.xpath("#lst-ib"));
        d.click();
        d.sendKeys(arg1);
        d.wait(10000);
    }


}
