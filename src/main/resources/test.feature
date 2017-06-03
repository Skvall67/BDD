Feature: First Test Feature

  @YandexMarketTest
  Scenario: Test 1
    Given открывает сайт "https://market.yandex.ru/"
    When находится на странице "Страница поиска Яндекс Маркет"
    When пользователь (заполняет поле) "Окно поиска" "фыфы"
    Then Проверяет окно ввода "строку поиска"
    Then Проверяет окно ввода "первую строку поиска"
