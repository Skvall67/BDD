package PageObjectsPackage;

import Tools.ActionTitle;
import Tools.PageTitle;
import Tools.Title;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static StepsDefinition.CommonStepDefinitions.getDriver;

/**
 * Created by drygoi on 03.06.17.
 */

@PageTitle(name = "Страница поиска Яндекс Маркет")
public class YandexStartPage extends MainPage {

    @FindBy(id = "header-search")
    @Title(value = "Окно поиска")
    WebElement findWindow;

    @FindBy(xpath = "//button[@type = 'submit']")
    @Title(value = "Найти")
    WebElement find;

    @FindBy(xpath = "//a[@class = 'snippet-card__header-link shop-history__link link i-bem link_js_inited']")
    @Title(value = "Список")
    List<WebElement> list;

    @FindBy(xpath = "//a[text() = 'по цене']")
    @Title(value = "Сортировать по цене")
    WebElement buttonSortCosts;

    @FindBy(xpath = "//a[@class = 'button button_size_m button_theme_pseudo i-bem button_js_inited']")
    @Title(value = "Показать еще")
    WebElement showMore;

    @FindBy(xpath = "//div[@class='price']")
    @Title(value = "Цены")
    List<WebElement> listCosts;

    @ActionTitle(name = "сравнивает цены")
    public void checkCosts(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        //wait.until(ExpectedConditions.visibilityOf(listCosts.get(0)));
        List<WebElement> list = findElementsByTitle(value);
        Assert.assertTrue(list.size()!=0);
        System.out.println("size::" + list.size());
        Thread.sleep(3000);
        for (WebElement we : list) {
           // wait.until(ExpectedConditions.visibilityOf(we));
            String s = we.getText();
            int cost = Integer.parseInt(s.replaceAll("[\\D]", ""));
            if (list.indexOf(we) != 0) {
                int previousCost = Integer.parseInt(list.get(list.indexOf(we) - 1).getText().replaceAll("[\\D]", ""));
                Assert.assertTrue("Отсортировано не по цене", cost >= previousCost);
                System.out.println("Цена " + cost + " больше, чем " + previousCost);
            }
        }
    }

    @ActionTitle(name = "делает проверку")
    public void checkName(String value, String result) throws ClassNotFoundException, IllegalAccessException {
        //wait.until(ExpectedConditions.visibilityOf(list.get(4)));
        //Assert.assertTrue(!list.isEmpty());
        for (WebElement we : findElementsByTitle(value)) {
            //wait.until(ExpectedConditions.elementToBeClickable(we));
            String s = we.getAttribute("title");
            System.out.println(s);
            Assert.assertTrue("Значение не соответствует ожидаемому. " +
                    "Ожидаемое значение: " + result + "Фактическое значение: " + s, s.toLowerCase().contains(result));
        }
    }

    @ActionTitle(name = "нажимает на кнопку")
    public void clickOnButton(String field) throws ClassNotFoundException, IllegalAccessException {
        wait.until(ExpectedConditions.visibilityOf(findElementByTitle(field)));
        findElementByTitle(field).click();

    }

    public YandexStartPage() {
        initElements();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("header-search"))));
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Не удалось иницализироать страницу");
        } catch (StaleElementReferenceException e) {
            System.out.println("shit happens");
        }
    }

}
