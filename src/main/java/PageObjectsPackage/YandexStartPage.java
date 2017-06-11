package PageObjectsPackage;

import Tools.ActionTitle;
import Tools.PageTitle;
import Tools.Title;
import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
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
    public static int minCost;
    public static String addressMin;

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

    //Тут начинается тестирование сайта cian

    @FindBy(xpath = "//button[@data-reactid='15']")
    @Title(value = "Купить")
    WebElement buyButton;

    @FindBy(xpath = "//div[text() = 'Посуточно']")
    @Title(value = "Посуточно")
    WebElement posyto4no;

    @FindBy(xpath = "//button[@data-reactid = '18']")
    @Title(value = "Квартиру")
    WebElement appartament;

    @FindBy(xpath = "//span[text() = 'Койко-место']")
    @Title(value = "Койко-место")
    WebElement koika;

    @FindBy(xpath = "//button[@data-reactid='38']")
    @Title(value = "Поиск")
    WebElement search;

    @FindBy(xpath = "//a[text() = '2']")
    @Title(value = "Страница 2")
    WebElement page2;

    @FindBy(xpath = "//div[@class = 'serp-item__price-col']/div[1]")
    @Title(value = "Цены посуточно")
    List<WebElement> listMinCost;

    @FindBy(xpath = "//button[@class='cui-modal__close']")
    @Title(value = "Закрыть")
    WebElement close;

    @FindBy(xpath = "//div[@class='serp-item__address-precise']")
    @Title(value = "Адреса")
    List<WebElement> address;

    @FindBy(xpath = "//input[@placeholder = 'до']")
    @Title(value = "Фильтр")
    WebElement filtr;

    @FindBy(xpath = "//div[@ng-click = 'showOffersButton.onClick($event)']")
    @Title(value = "Показать")
    WebElement show;




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

    @ActionTitle(name = "ищет минимальную цену и адрес")
    public void findMinCost(String value, String address) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        List<WebElement> addressList = findElementsByTitle(address);
        List<WebElement> list = findElementsByTitle(value);
        Assert.assertTrue(list.size()!=0);
        addressMin = addressList.get(0).getText();
        minCost = Integer.parseInt(list.get(0).getText().replaceAll("\\D", ""));
        for (WebElement we : list) {
            int cost = Integer.parseInt(we.getText().replaceAll("\\D", ""));
            Assert.assertTrue("Invalid price", cost > 0);
            if(cost < minCost) {
                minCost = cost;
                addressMin = addressList.get(list.indexOf(we)).getText();
            }
        }
        }

    @ActionTitle(name = "проверяет минимальную цену")
    public void checkMinCost(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        List<WebElement> addressList = findElementsByTitle(value);
        //Assert.assertTrue(list.size()!=0);
        //String oneMoreAddressMin = addressList.getText();
        String s = "";
        for (WebElement we : addressList) {
            if(we.getText().contains(addressMin))
            {
                s = we.getText();
                System.out.println("Тест пройден");
                break;
            }
        }
        Assert.assertTrue("Совпадение по квартире не найдено", s.equalsIgnoreCase(addressMin));

//        int oneMoreMinCost = Integer.parseInt(list.getText().replaceAll("\\D", ""));
//        Assert.assertTrue("Адреса не совпадают!!!", oneMoreAddressMin.equalsIgnoreCase(addressMin));
//        Assert.assertTrue("Цены не совпадают!!!", oneMoreMinCost == minCost);
//        System.out.println("Проверка пройдена, адрес " + addressMin + " равен адресу" + oneMoreAddressMin);

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

                wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//*[contains(@class, 'header-logo')]"))));
            } catch (NoSuchElementException e) {
                throw new NoSuchElementException("Не удалось иницализироать страницу \n" + e);
            } catch (StaleElementReferenceException e) {
                System.out.println("shit happens");
            }
    }

}
