@Regression
Feature: Scenario Outline feature


  Scenario Outline: Проверка Логин функции
    Given Я как пользователь должен открыть сайт "fb.com"
    And В поле email вводим email "<email>"
    When В поле пароль вводим "<password>"
    Then Я должен нажать на кнопку войти в систему
    Then Система должна вывести ошибку "Вы ввели не правильные данные"
    Examples:
      |email            |password       |
      |test@test.com    |123456         |
      |test123@gmail.com|Hello312       |
      |john@yahoo.com   |Password123!@# |





  Scenario Outline: Поиск по имени и фамилии в Vkontakte
    Given Я должен открыть сайт "vk.com"
    And Я должен перейти на окно поиска
    And В поле имя я должен ввести "<username>"
    And В поле фамилия я должен ввести "<lastname>"
    When Я должен нажать на кнопку поиск
    Then Система должна показать людей "<username1>" и "<lastname1>" + и его идентификационный номер <id>
    Examples:
      | username | lastname | username1 | lastname1 | id     |
      | Юра      | Гагарин  | Юрий      | Гагарин   | 7.89456 |
      | Ваня     | Петр     | Иван      | Петров    | 454.511 |
      | Нута     | Мусакунов| Нурсултан | Мусакунов | 15.2112 |
      | Вася     | Вася     | Василий   | Василев   | 114.332 |
