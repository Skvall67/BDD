#language: ru

Функционал: Документы ДЛКО

  @dlko8
  Структура сценария: проверка добавления документа «Документ о списании актива» к активу, который имеет статус «Списан»
    Дано открывает сайт "http://as-sua-tst-web.dfu.i-teco.ru:7003/sua/"
    Если находится на странице "Страница поиска Яндекс Маркет"
    Если пользователь (заполняет поле) "Логин" "sua_all"
    Если пользователь (заполняет поле) "Пароль" "Q1w2e3r4"
    Если пользователь (нажимает на кнопку) "Войти"
    Если пользователь (нажимает на кнопку) "Финансовая организация"
    Если пользователь (нажимает на кнопку) "Выбрать"
    Если пользователь (открыл экранную форму) "Список активов"
    Если пользователь (нажимает на кнопку) "Сбор и ведение данных"
    Если пользователь (нажимает на кнопку) "Документы ДЛКО"
    Если пользователь (открыл экранную форму) "Документы ДЛКО"
    Если пользователь (нажимает на кнопку) "Поиск счета"
    Если пользователь (нажимает на кнопку) "Выпадающий список"
    Если пользователь (нажимает на кнопку) "Номер лицевого счета"
    Если пользователь (заполняет поле) "Поле поиска" "<Номер лицевого счета тестового актива>"
    Если пользователь (нажимает на кнопку) "Найти счет"
    Если пользователь (открыл экранную форму) "Документы ДЛКО"
    Если пользователь (выделяет строку) "<Номер лицевого счета тестового актива>"
    Если пользователь (проверяет созданный документ) "<Документ>"
    Если пользователь (устанавливает чек-бокс) "<Номер лицевого счета тестового актива>"
    Если пользователь (нажимает на кнопку) "Утилизация"
    Если пользователь (нажимает на кнопку) "Создать новый договор"
    Если пользователь (нажимает на кнопку) "Закрыть"
    Если пользователь (открыл экранную форму) "Документы ДЛКО"
    Если пользователь (закрывает браузер) "0аргумент0"


    Примеры:
      |Номер лицевого счета тестового актива| Документ                  |
      |45507810188880000011                 | Документ о списании актива|
      |45507810188880000011                 | Договор утилизации        |