package PageObjectsPackage;

import Tools.ActionTitle;
import Tools.PageTitle;
import Tools.Title;
import com.sun.xml.internal.ws.policy.AssertionValidationProcessor;
import javafx.scene.web.WebView;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static StepsDefinition.CommonStepDefinitions.getDriver;
import static StepsDefinition.CommonStepDefinitions.quitDriver;

/**
 * Created by drygoi on 03.06.17.
 */

@PageTitle(name = "Страница поиска Яндекс Маркет")
public class YandexStartPage extends MainPage {
    public static int minCost;
    public static String addressMin;
    public static boolean flag;

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

    @FindBy(xpath = "//button[text() = 'Закрыть']")
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



    // Сценарии по ДЛКО

    @FindBy(xpath = "//input[@id = 'username']")
    @Title(value = "Логин")
    WebElement login;

    @FindBy(xpath = "//input[@id = 'password']")
    @Title(value = "Пароль")
    WebElement password;

    @FindBy(xpath = "//button[text() = 'Войти']")
    @Title(value = "Войти")
    WebElement enter;

    @FindBy(xpath = "//td[text() = '10']") //td[text() = '10'] //tr[@class = 'jqgfirstrow'] //tr[@id='1020']/td[1]
    @Title(value = "Финансовая организация")
    WebElement finOrg;

    @FindBy(xpath = "//td[text() = 'Торговый Городской Банк']") //td[text() = '10'] //tr[@class = 'jqgfirstrow'] //tr[@id='1020']/td[1]
    @Title(value = "Торговый городской банк")
    WebElement torgBank;

    @FindBy(xpath = "(//td[text() = 'Торговый Городской Банк'])[2]") //td[text() = '10'] //tr[@class = 'jqgfirstrow'] //tr[@id='1020']/td[1]
    @Title(value = "Торговый городской банк2")
    WebElement torgBank2;

    @FindBy(xpath = "//button[text() = 'Выбрать']")
    @Title(value = "Выбрать")
    WebElement choise;

    @FindBy(xpath = "(//button[text() = 'Выбрать'])[2]")
    @Title(value = "Выбрать2")
    WebElement choise2;

    @FindBy(xpath = "//button[@title = 'Выбрать']")
    @Title(value = "Выбрать3")
    WebElement choise3;

    @FindBy(xpath = "//a[contains(text(), 'Сбор и ведение данных')]")
    @Title(value = "Сбор и ведение данных")
    WebElement dataPrepare;

    @FindBy(xpath = "//a[text() = 'Документы ДЛКО']")
    @Title(value = "Документы ДЛКО")
    WebElement dlkoDocs;

    @FindBy(xpath = "//a[contains(text(), 'Список активов')]")
    @Title(value = "Список активов")
    WebElement activeList;

    @FindBy(xpath = "//button[text() = 'Создать']")
    @Title(value = "Создать")
    WebElement create;

    @FindBy(xpath = "//select[contains(@name, 'asset')]")
    @Title(value = "Тип актива")
    WebElement selectActive;

    @FindBy(xpath = "//option[text() = 'Денежные средства']")
    @Title(value = "Денежные средства")
    WebElement selectActiveType1;

    @FindBy(xpath = "//button[contains(text(), 'Далее')]")
    @Title(value = "Далее")
    WebElement next;

    @FindBy(xpath = "//input[@name = 'accountNum']")
    @Title(value = "Номер счета")
    WebElement accountNum;

    @FindBy(xpath = "//input[@name = 'balanceInitial']")
    @Title(value = "Начальная балансовая стоимость")
    WebElement balanceInitial;

    @FindBy(xpath = "//input[@name = 'name']")
    @Title(value = "Наименование актива")
    WebElement nameActive;

    @FindBy(xpath = "//button[@form = 'cardForm'][1]")
    @Title(value = "Сохранить актив")
    WebElement saveActiveButton;

    @FindBy(xpath = "//td[@title = '60804810089498415648']/../td/input")
    @Title(value = "Чек-бокс номера")
    WebElement checkBoxNumber;

    @FindBy(xpath = "//button[contains(text(), 'Списание')]")
    @Title(value = "Списание")
    WebElement spisanie;

    @FindBy(xpath = "//a[contains(text(), 'Создать новый документ')]")
    @Title(value = "Создать новый документ")
    WebElement createNewDoc;

    @FindBy(xpath = "//input[@name = 'documentName']")
    @Title(value = "Наименование документа о списании")
    WebElement documentName;

    @FindBy(xpath = "//input[@name = 'writeReason']")
    @Title(value = "Основание для списания актива")
    WebElement writeReason;

    @FindBy(xpath = "//input[@name = 'writeAcceptOverLimit']")
    @Title(value = "Кем утверждено списание для актива свыше лимита")
    WebElement writeAcceptOverLimit;

    @FindBy(xpath = "//input[@name = 'writeAccept']")
    @Title(value = "Кем утверждено основание для списания актива")
    WebElement writeAccept;

    @FindBy(xpath = "//input[@name = 'contractDate']")
    @Title(value = "Дата документа о списании актива")
    WebElement contractDate;

    @FindBy(xpath = "//input[@name = 'writeReasonDate']")
    @Title(value = "Дата основания для списания актива")
    WebElement writeReasonDate;

    @FindBy(xpath = "//input[@name = 'writeAcceptOverLimitDate']")
    @Title(value = "Дата утверждения списания для актива свыше лимита")
    WebElement writeAcceptOverLimitDate;

    @FindBy(xpath = "//input[@name = 'writeAcceptDate']")
    @Title(value = "Дата утверждения основания для списания актива")
    WebElement writeAcceptDate;

    @FindBy(xpath = "//input[@name = 'documentNumber']")
    @Title(value = "Номер документа о списании актива")
    WebElement documentNumber2;

    @FindBy(xpath = "//input[@name = 'writeReasonNumber']")
    @Title(value = "Номер основания для списания актива")
    WebElement writeReasonNumber;

    @FindBy(xpath = "//input[@name = 'writeAcceptOverLimitNumber']")
    @Title(value = "Номер утверждения списания для актива свыше лимита")
    WebElement writeAcceptOverLimitNumber;

    @FindBy(xpath = "//input[@name = 'documentNumber']")
    @Title(value = "Номер договора об утилизации")
    WebElement documentNumber3;

    @FindBy(xpath = "//input[@name = 'contractDate']")
    @Title(value = "Дата договора об утилизации актива")
    WebElement contractDateUtil;

    @FindBy(xpath = "//input[@name = 'writeAcceptNumber']")
    @Title(value = "Номер утверждения основания для списания актива")
    WebElement writeAcceptNumber;

    @FindBy(xpath = "//input[@name = 'involvedParty']")
    @Title(value = "Контрагент")
    WebElement involvedParty;

    @FindBy(xpath = "//div[@id = 'jqgh_dlko-docs-assets_id']")
    @Title(value = "Сортировать по ID")
    WebElement idSort;

    @FindBy(xpath = "//div[@id = 'jqgh_lc-docs-assets_id']")
    @Title(value = "Сортировать по ID КД")
    WebElement idSortCD;

    @FindBy(xpath = "//button[contains(@ng-click, 'save')]")
    @Title(value = "Сохранить")
    WebElement saveButton;

    @FindBy(xpath = "//button[@ng-click = 'save()']")
    @Title(value = "Сохранить списание")
    WebElement spisanieSaveButton;

    @FindBy(xpath = "//button[contains(text(), 'Удалить')]")
    @Title(value = "Удалить")
    WebElement deleteButton;

    @FindBy(xpath = "//button[@ng-click = 'yes()']")
    @Title(value = "Да")
    WebElement yesButton;

    //Scenario 8, 9, 10
    @FindBy(xpath = "//a[contains(text(), 'Настройка')]")
    @Title(value = "Настройка")
    WebElement setting;

    @FindBy(xpath = "//a[contains(text(), 'Справочники')]")
    @Title(value = "Справочники")
    WebElement spravo4niki;

    @FindBy(xpath = "//a[contains(text(), 'Вовлечённые стороны ФЛ')]")
    @Title(value = "Вовлеченные стороны ФЛ")
    WebElement storoniFizLic;

    @FindBy(xpath = "//a[contains(text(), 'Кредитные договоры')]")
    @Title(value = "Кредитные договоры")
    WebElement creditnieDogovori;

    @FindBy(xpath = "//a[contains(text(), 'План счетов  по КО')]")
    @Title(value = "План счетов по КО")
    WebElement planS4etovKO;

    @FindBy(xpath = "//a[contains(text(), 'План счетов  по МФ')]")
    @Title(value = "План счетов по МФ")
    WebElement planS4etovMF;

    @FindBy(xpath = "//option[text() = 'Ссудная и приравненная к ней задолженность']")
    @Title(value = "Ссудная и приравненная к ней задолженность")
    WebElement selectActiveType8;

    @FindBy(xpath = "//option[text() = 'Транспортные средства']")
    @Title(value = "Транспортные средства")
    WebElement selectActiveType9;

    @FindBy(xpath = "//option[text() = 'Ценные бумаги']")
    @Title(value = "Ценные бумаги")
    WebElement selectActiveType10;

    @FindBy(xpath = "//input[@name = 'vehicleType']")
    @Title(value = "Тип транспортного средства")
    WebElement vehicleType;

    @FindBy(xpath = "//button[contains(text(), 'Создать КД')]")
    @Title(value = "Создать КД")
    WebElement createCD;

    @FindBy(xpath = "//button[contains(text(), 'Создать счёт 1-го порядка')]")
    @Title(value = "Создать счёт 1-го порядка")
    WebElement createFirstCount;

    @FindBy(xpath = "//button[contains(text(), 'Создать счёт 2-го порядка')]")
    @Title(value = "Создать счёт 2-го порядка")
    WebElement createSecondCount;

    @FindBy(xpath = "//input[@name = 'parentBalanceAccountNum']")
    @Title(value = "Номер счета 1-го порядка")
    WebElement parentBalanceAccountNum;

    @FindBy(xpath = "//input[@name = 'balanceAccountNum']")
    @Title(value = "Номер счета 2-го порядка")
    WebElement balanceAccountNum;

    @FindBy(xpath = "//textarea[@name = 'parentAccountName']")
    @Title(value = "Наименование счета 1-го порядка")
    WebElement parentAccountName;

    @FindBy(xpath = "//textarea[@name = 'accountName']")
    @Title(value = "Наименование счета 2-го порядка")
    WebElement accountName;

    @FindBy(xpath = "//input[@name = 'dateTimeFrom']")
    @Title(value = "Дата начала действия")
    WebElement firstDate;

    @FindBy(xpath = "//input[@name = 'dateTimeTill']")
    @Title(value = "Дата окончания действия")
    WebElement secondDate;

    @FindBy(xpath = "//input[@name = 'documentNumber']")
    @Title(value = "Номер кредитного договора")
    WebElement documentNumber;

    @FindBy(xpath = "//select[@name = 'assetAccountType']")
    @Title(value = "Тип актива учетный")
    WebElement tipActivaY4etniy;

    @FindBy(xpath = "//option[contains(text(), 'проценты по предоставленным межбанковским кредитам')]")
    @Title(value = "Выбор типа актива учетного")
    WebElement activePeredanniy;

    @FindBy(xpath = "//select[@name = 'clientStatus']")
    @Title(value = "Статус клиента")
    WebElement clientStatus;

    @FindBy(xpath = "//option[contains(text(), 'Действующий')]")
    @Title(value = "Выбор статуса клиента")
    WebElement clientStatusChoise;

    @FindBy(xpath = "//select[@name = 'assetFunctionalType']")
    @Title(value = "Тип актива функциональный")
    WebElement tipActivaFunc;

    @FindBy(xpath = "//option[contains(text(), 'Ссудная и приравненная к ней задолженность')]")
    @Title(value = "Выбор типа актива функционального")
    WebElement activePeredanniyFunc;

    @FindBy(xpath = "//select[@title = 'Записей на стр.']")
    @Title(value = "Количество записей")
    WebElement number1;

    @FindBy(xpath = "//option[text() = '100']")
    @Title(value = "100")
    WebElement number100;

    @FindBy(xpath = "//select[@name = 'accountFlag']")
    @Title(value = "Признак счёта")
    WebElement priznakS4eta;

    @FindBy(xpath = "//select[@name = 'repayment']")
    @Title(value = "Статус КД")
    WebElement repayment;

    @FindBy(xpath = "//option[contains(text(), 'действителен')]")
    @Title(value = "Выбор статуса КД")
    WebElement repaymentVibor;

    @FindBy(xpath = "//option[text() = 'А']")
    @Title(value = "Выбор признака счёта")
    WebElement viborPriznakaS4eta;

    @FindBy(xpath = "//select[@name = 'inventoryFormType']")
    @Title(value = "Наименование формы инвентаризации")
    WebElement nameFormi;

    @FindBy(xpath = "//select[@name = 'inventoryFormType']/option[contains(text(), 'Ссудная и прочая дебиторская задолженность')]")
    @Title(value = "Выбор наименования формы инвентаризации")
    WebElement viborNameFormi;

    @FindBy(xpath = "//select[@name = 'sourceForming']")
    @Title(value = "Источник формирования актива")
    WebElement sourceForming;

    @FindBy(xpath = "//select[@name = 'sourceForming']/option[contains(text(), 'Имущество для осуществления уставной деятельности')]")
    @Title(value = "Выбор источника формирования актива")
    WebElement sourceFormingChoise;

    @FindBy(xpath = "//span[@class = 'ui-icon fa fa-search fa-fw']")
    @Title(value = "Поиск счета")
    WebElement findPoisk;

    @FindBy(xpath = "//option[@value = 'parentBalanceAccountNum']")
    @Title(value = "Выбор счета 1-го порядка")
    WebElement s4etPervogoPoryadka;

    @FindBy(xpath = "//option[@value = 'accountNum']")
    @Title(value = "Номер лицевого счета")
    WebElement accountNumber;

    @FindBy(xpath = "//td[@class = 'columns']")
    @Title(value = "Выпадающий список")
    WebElement comboBox;

    @FindBy(xpath = "//td[@class = 'data']/input")
    @Title(value = "Поле поиска")
    WebElement findField;

    @FindBy(xpath = "//span[text() = 'Найти']")
    @Title(value = "Найти счет")
    WebElement findButton;

    @FindBy(xpath = "//span[@tooltip = 'Выбрать физ. лицо']")
    @Title(value = "Выбор физ. лица")
    WebElement fizFaceButton;

    @FindBy(xpath = "//td[@title = 'Давыдов']")
    @Title(value = "Физ. лицо")
    WebElement fizFace;

    @FindBy(xpath = "//button[@ng-click = 'select(selectedId)']")
    @Title(value = "Выбрать физ. лицо (кнопка)")
    WebElement fizFaceChoiseButton;

    @FindBy(xpath = "//button[text() = 'OK']")
    @Title(value = "ОК")
    WebElement okeiButton;

    @FindBy(xpath = "//button[@ng-click = \"selectDocument('loanDebt.contract', 19)\"]")
    @Title(value = "Выбрать номер кредитного договора")
    WebElement choiseCDnumber;

    @FindBy(xpath = "//button[@ng-click = 'select()'][text() = 'Выбрать']")
    @Title(value = "Подтвердить выбор номера кредитного договора")
    WebElement choiseCDnumberButton;

    @FindBy(xpath = "//td[@aria-describedby = 'lc-docs-docs_checkColumn']")
    @Title(value = "Выбор чек-бокса КД")
    WebElement choiseCheckBoxCD;

    @FindBy(xpath = "//button[@ng-click = 'removeLoanContractLinks()']")
    @Title(value = "Удаление счета из КД")
    WebElement deleteCountCD;

    @FindBy(xpath = "//button[text() = 'Удалить']")
    @Title(value = "Удалить КД")
    WebElement deleteCD;

    @FindBy(xpath = "//span[@title = 'Сделать таблицу первичной']")
    @Title(value = "Сделать таблицу первичной")
    WebElement doFirstTableCD;

    @FindBy(xpath = "//input[@name = 'passportSeries']")
    @Title(value = "Серия паспорта")
    WebElement passportSeries;

    @FindBy(xpath = "//input[@name = 'passportNumber']")
    @Title(value = "Номер паспорта")
    WebElement passportNumber;

    @FindBy(xpath = "//input[@name = 'surname']")
    @Title(value = "Фамилия")
    WebElement surname;

    @FindBy(xpath = "//input[@name = 'firstName']")
    @Title(value = "Имя")
    WebElement firstName;

    @FindBy(xpath = "//a[@ng-click = '$event.preventDefault()' and text() = 'Роли']")
    @Title(value = "Роли")
    WebElement roli;

    @FindBy(xpath = "//a[text() = 'Приём']")
    @Title(value = "Прием")
    WebElement priem;

    @FindBy(xpath = "//input[@name = 'startDate']")
    @Title(value = "Дата начала действия актива")
    WebElement startDate;

    @FindBy(xpath = "//span[text() = 'Назначить роль']")
    @Title(value = "Назначить роль")
    WebElement nazna4itRol;

    @FindBy(xpath = "//td[text() = 'Заемщик']")
    @Title(value = "Заемщик")
    WebElement zaemwik;

    @FindBy(xpath = "//button[text() = 'Назначить']")
    @Title(value = "Назначить")
    WebElement nazna4itButton;



    @FindBy(xpath = "//button[contains(text(), 'Утилизация')]")
    @Title(value = "Утилизация")
    WebElement recycling;

    @FindBy(xpath = "(//a[contains(text(), 'Создать новый договор')])[3]")
    @Title(value = "Создать новый договор")
    WebElement createNewContract;

    @FindBy(xpath = "//button[text()='Редактировать']/../button[text()='Отмена']")
    @Title(value = "Отмена")
    WebElement cancel;

    @FindBy(xpath = "//button[text()='Редактировать']")
    @Title(value = "Редактировать")
    WebElement edit;
/*
    @FindBy(xpath = )
    @Title(value = "Актив")
    WebElement active;

    @FindBy(xpath = )
    @Title(value = "Удалить актив из документа")
    WebElement deleteActive;

    @FindBy(xpath = )
    @Title(value = "ID тестового актива")
    WebElement activeID;

    @FindBy(xpath = )
    @Title(value = "Статус работы с активом")
    WebElement activeStatus;

    @FindBy(xpath = )
    @Title(value = "Экранная форма Документы ДЛКО")
    WebElement dlkoDocsForm;

    @FindBy(xpath = )
    @Title(value = "Системное сообщение ошибки утилизации")
    WebElement recyclingError;

    @FindBy(xpath = )
    @Title(value = "Системное сообщение ошибки списания")
    WebElement spisanieError;

*/

    @ActionTitle(name = "закрывает браузер")
    public void closeWebBrowser(String value) throws ClassNotFoundException, IllegalAccessException {
        quitDriver();
    }

    @ActionTitle(name = "проверяет")
    public void check(String value, String result) throws ClassNotFoundException, IllegalAccessException {
        WebElement activeStatus = findElementByTitle(value);
        Assert.assertTrue("Значение \"Статус работы с активом\" не равно \"Активно\"",
                activeStatus.getText().equalsIgnoreCase("Активно"));
    }

    @ActionTitle(name = "проверяет статус работы с активом")
    public void checkActiveStatus(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        Thread.sleep(1000);
        WebElement activeStatus = getDriver().findElement(By.xpath("//select[@name = 'workState']"));
        wait.until(ExpectedConditions.visibilityOf(activeStatus));
        Select select = new Select(activeStatus);

        Assert.assertTrue("Значение \"Статус работы с активом\" не равно \"Активный\"",
                select.getFirstSelectedOption().getText().equalsIgnoreCase(value));
        System.out.println("Статус работы с активом: Активный.");
    }

    @ActionTitle(name = "проверяет")
    public void check(String value) throws ClassNotFoundException, IllegalAccessException {
        WebElement dlkoDocsForm = findElementByTitle(value);
        Assert.assertTrue("Экранная форма 'Документы ДЛКО' не открылась",
                dlkoDocsForm.isDisplayed());
    }


    @ActionTitle(name = "проверяет созданного клиента")
    public void checkCreatedClient(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//input[@name = 'choosen']";
        Thread.sleep(1000);
        //WebElement radioButton = null;
        try {
            WebElement radioButton = getDriver().findElement(By.xpath(s));
            radioButton.click();
            next.click();
            flag = true;
        } catch (NoSuchElementException e) {
            System.out.println("Создание нового пользователя");
        }
    }

    @ActionTitle(name = "проверяет созданный документ")
    public void checkCreatedDocument(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//td[text() = '" + value + "']";
        Thread.sleep(1000);
        WebElement createdDocument = getDriver().findElement(By.xpath(s));
        wait.until(ExpectedConditions.visibilityOf(createdDocument));
        Assert.assertTrue("По каким-то нехорошим причинам новый актив не был создан",
                createdDocument.getText().equalsIgnoreCase(value));
    }


    @ActionTitle(name = "заполняет поле с проверкой")
    public void fillsFieldChecked(String field, String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {

        if (!flag) {
            Thread.sleep(1000);
            findElementByTitle(field).click();
            findElementByTitle(field).sendKeys(value);
        }
    }


    @ActionTitle(name = "открыл экранную форму")
    public void checkPage(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//li[contains(text(), '" + value + "')]";
        Thread.sleep(1000);
        WebElement openForm = getDriver().findElement(By.xpath(s));
        Assert.assertTrue("Экранная форма '" + value +  "' не открылась",
                openForm.isDisplayed());
    }

    @ActionTitle(name = "устанавливает чек-бокс")
    public void checkBox(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//td[@title = '" + value + "']/../td/input";
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(s)).click();
    }

    @ActionTitle(name = "выделяет строку")
    public void highlightCount(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//tr/td[text() = '" + value + "']";
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(s))));
        getDriver().findElement(By.xpath(s)).click();
    }

    @ActionTitle(name = "ищет строку счета")
    public void selectString(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//td[text() = 'Действующая']/../td[text() = '" + value + "']";
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.xpath(s))));
        getDriver().findElement(By.xpath(s)).click();
    }

    @ActionTitle(name = "проверяет созданный актив")
    public void checkCreatedActive(String value) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//td[@title = '" + value + "']";
        Thread.sleep(1000);
        WebElement createdActive = getDriver().findElement(By.xpath(s));

        wait.until(ExpectedConditions.visibilityOf(createdActive));
        Assert.assertTrue("По каким-то нехорошим причинам новый актив не был создан",
                createdActive.getText().equalsIgnoreCase(value));

        System.out.println(createdActive.getText() + " = " + value);
    }

    @ActionTitle(name = "проверяет удаленный актив")
    public void checkDeletedActive(String value) throws ClassNotFoundException, IllegalAccessException {
        String s = "//td[@title = '" + value + "']";
        wait.until(ExpectedConditions.visibilityOf(findElementByTitle(s)));
        WebElement createdActive = findElementByTitle(s);
        try {
            Assert.assertFalse("Актив не удалился",
                    findElementByTitle(value).isEnabled());
        } catch (NoSuchElementException ex) {
            System.out.println("Актив удален");
        }



    }


    // Сценарии по ДЛКО




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
    public void clickOnButton(String field) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(findElementByTitle(field)));
        findElementByTitle(field).click();
    }

    @ActionTitle(name = "нажимает на кнопку с проверкой")
    public void clickOnButtonChecked(String field) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        if (!flag) {
            Thread.sleep(1000);
            wait.until(ExpectedConditions.elementToBeClickable(findElementByTitle(field)));
            findElementByTitle(field).click();
        }
    }

    @ActionTitle(name = "нажимает на кнопку ID")
    public void clickOnButtonID(String field) throws ClassNotFoundException, IllegalAccessException, InterruptedException {
        String s = "//td[@title = '" + field + "']/../td[3]/a";
        Thread.sleep(1000);
        WebElement button = getDriver().findElement(By.xpath(s));
        wait.until(ExpectedConditions.visibilityOf(button));
        button.click();
    }

    public YandexStartPage() {
        initElements();
            try {

                wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.xpath("//img[@title = 'Агентство по страхованию вкладов']"))));
            } catch (NoSuchElementException e) {
                throw new NoSuchElementException("Не удалось иницализироать страницу \n" + e);
            } catch (StaleElementReferenceException e) {
                System.out.println("shit happens");
            }
    }
}
