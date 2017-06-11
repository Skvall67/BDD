package PageObjectsPackage;

import Tools.ActionTitle;
import Tools.ReflectionHelper;
import Tools.Title;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Field;
import java.util.List;

import static StepsDefinition.CommonStepDefinitions.Init;
import static StepsDefinition.CommonStepDefinitions.getDriver;
//import static org.openqa.selenium.support.ui.ExpectedConditions.findElements;


/**
 * Created by drygoi on 03.06.17.
 */
public class MainPage {

    WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    protected void initElements() {
        PageFactory.initElements(getDriver(), this);
    }

    @ActionTitle(name = "заполняет поле")
    public void fillsField(String field, String value) throws ClassNotFoundException, IllegalAccessException {
        findElementByTitle(field).click();
        findElementByTitle(field).sendKeys(value);
    }

    @ActionTitle(name = "заполняет поле фильтра")
    public void fillsField(String field) throws ClassNotFoundException, IllegalAccessException {
        findElementByTitle(field).click();
        findElementByTitle(field).sendKeys(String.valueOf(YandexStartPage.minCost));
    }




    public WebElement findElementByTitle(String title) throws ClassNotFoundException, IllegalAccessException {
        //todo дописать сюда алгоритм поиска по классам через анотацию @Title
        Class cl = Class.forName(Init.getName());
        List<Field> fields = ReflectionHelper.getFieldsAnnotatedWith(Init, Title.class, title);

        int fieldNumber = fields.size();

        Assert.assertTrue("Количесто полей не соответсвует ожидаемому : \"" + title + "\". Найдено: " +
                        fieldNumber + " Ожидается : 1",
                fieldNumber == 1);

        Field field = fields.get(0);
        WebElement el = (WebElement) field.get(this);
        return el;
    }

    public List<WebElement> findElementsByTitle(String title) throws ClassNotFoundException, IllegalAccessException {
        //todo дописать сюда алгоритм поиска по классам через анотацию @Title
        Class cl = Class.forName(Init.getName());
        List<Field> fields = ReflectionHelper.getFieldsAnnotatedWith(Init, Title.class, title);

        int fieldNumber = fields.size();

        Assert.assertTrue("Количесто полей не соответсвует ожидаемому : \"" + title + "\". Найдено: " +
                        fieldNumber + " Ожидается : 1",
                fieldNumber == 1);

        Field field = fields.get(0);
        List<WebElement> el = (List<WebElement>) field.get(this);
        return el;
    }
}
