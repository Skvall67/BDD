package PageObjectsPackage;

import Tools.PageTitle;
import Tools.Title;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static StepsDefinition.CommonStepDefinitions.getDriver;

/**
 * Created by drygoi on 03.06.17.
 */

@PageTitle(name = "Страница поиска Яндекс Маркет")
public class YandexStartPage extends MainPage {

    @FindBy(id = "header-search")
    @Title(value = "Окно поиска")
    WebElement findWindow;

    public YandexStartPage() {
        initElements();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(findWindow));
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Не удалось иницализироать страницу");
        }
    }

}
