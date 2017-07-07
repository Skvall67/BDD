#language: ru

Функционал: Создание активов

  @scen19
  Структура сценария: создание актива «Ссудная и приравненная к ней задолженность» для ФО типа, отличного от КО
    Дано открывает сайт "http://as-sua-tst-web.dfu.i-teco.ru:7003/sua/"
    Если находится на странице "Страница поиска Яндекс Маркет"
    Если пользователь (заполняет поле) "Логин" "sua_all"
    Если пользователь (заполняет поле) "Пароль" "Q1w2e3r4"
    Если пользователь (нажимает на кнопку) "Войти"
    Если пользователь (нажимает на кнопку) "Торговый городской банк"
    Если пользователь (нажимает на кнопку) "Выбрать"
    Если пользователь (нажимает на кнопку) "Сбор и ведение данных"
    Если пользователь (нажимает на кнопку) "Список активов"
    Если пользователь (открыл экранную форму) "Список активов"
    Если пользователь (нажимает на кнопку) "Создать"
    Если пользователь (открыл экранную форму) "Создание актива (первый этап)"
    Если пользователь (нажимает на кнопку) "Тип актива"
    Если пользователь (нажимает на кнопку) "Транспортные средства"
    Если пользователь (нажимает на кнопку) "Далее"
    Если пользователь (открыл экранную форму) "Создание актива (второй этап)"
    Если пользователь (заполняет поле) "Номер счета" "<Номер счета>"
    Если пользователь (заполняет поле) "Начальная балансовая стоимость" "<Денежный эквивалент>"
    Если пользователь (нажимает на кнопку) "Источник формирования актива"
    Если пользователь (нажимает на кнопку) "Выбор источника формирования актива"
    Если пользователь (заполняет поле) "Наименование актива" "<Наименование актива>"
    Если пользователь (заполняет поле) "Тип транспортного средства" "<Тип>"
    Если пользователь (нажимает на кнопку) "Прием"
    Если пользователь (заполняет поле) "Дата начала действия актива" "30.06.2017"
    Если пользователь (нажимает на кнопку) "Сохранить актив"
    Если пользователь (нажимает на кнопку) "Сбор и ведение данных"
    Если пользователь (нажимает на кнопку) "Список активов"
    Если пользователь (открыл экранную форму) "Список активов"
    Если пользователь (проверяет созданный актив) "<Номер счета>"
    Если пользователь (устанавливает чек-бокс) "<Номер счета>"
    Если пользователь (нажимает на кнопку) "Удалить"
    Если пользователь (нажимает на кнопку) "Да"
    Если пользователь (закрывает браузер) "0аргумент0"



    Примеры:
      | Тип    | Номер счета        | Денежный эквивалент | Наименование актива | Серия |   Номер   | Фамилия     | Имя      |
      | тип1   |325                 | 46543               | bzxc34698           | 1234  | 567890    | Давыдов     | Алексей  |