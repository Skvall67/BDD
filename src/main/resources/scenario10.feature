#language: ru

Функционал: Создание активов


  @scen10
  Структура сценария: создание актива «Ценные бумаги»
    Дано открывает сайт "http://as-sua-tst-web.dfu.i-teco.ru:7003/sua/"
    Если находится на странице "Страница поиска Яндекс Маркет"
    Если пользователь (заполняет поле) "Логин" "sua_all"
    Если пользователь (заполняет поле) "Пароль" "Q1w2e3r4"
    Если пользователь (нажимает на кнопку) "Войти"
    Если пользователь (нажимает на кнопку) "Финансовая организация"
    Если пользователь (нажимает на кнопку) "Выбрать"
    Если пользователь (нажимает на кнопку) "Сбор и ведение данных"
    Если пользователь (нажимает на кнопку) "Список активов"
    Если пользователь (открыл экранную форму) "Список активов"
    Если пользователь (нажимает на кнопку) "Создать"
    Если пользователь (открыл экранную форму) "Создание актива (первый этап)"
    Если пользователь (нажимает на кнопку) "Тип актива"
    Если пользователь (нажимает на кнопку) "Ценные бумаги"
    Если пользователь (нажимает на кнопку) "Далее"
    Если пользователь (открыл экранную форму) "Создание актива (второй этап)"
    Если пользователь (заполняет поле) "Номер счета" "<Номер счета>"
    Если пользователь (заполняет поле) "Начальная балансовая стоимость" "<Денежный эквивалент>"
    Если пользователь (заполняет поле) "Наименование актива" "<Наименование актива>"
    Если пользователь (нажимает на кнопку) "Сохранить"
    Если пользователь (нажимает на кнопку) "Сбор и ведение данных"
    Если пользователь (нажимает на кнопку) "Список активов"
    Если пользователь (открыл экранную форму) "Список активов"
    Если пользователь (проверяет созданный актив) "<Номер счета>"
    Если пользователь (устанавливает чек-бокс) "<Номер счета>"
    Если пользователь (нажимает на кнопку) "Удалить"
    Если пользователь (нажимает на кнопку) "Да"
    Если пользователь (закрывает браузер) "0аргумент0"


    Примеры:
      | Номер счета        | Денежный эквивалент | Наименование актива |
      |50104810978946546732| 46543               | bzxc34698           |
      |50211810843156497854| 45776               | xzcv14467           |
      |52503810456219748456| 228228              | xzcx53464           |