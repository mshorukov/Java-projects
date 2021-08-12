Feature: Data table practice

  Scenario: Пользователь должен зарегаться с разными данными
    Given Пользователь на странице регистрации
    When Пользователь должен ввести данные
      | John  | Doe       | 1990 | john@gmail.com  | USA |
      | Elon  | Musk      | 1980 | musk@tesla.com  | USA |
      | Mark  | Zukenberg | 1978 | mark@fb.com     | USA |
      | Steve | Jobs      | 1960 | steve@apple.com | KGZ |
    Then Пользователь должен нажать на кнопку Регистрация
    Then Пользователь должен успешно зарегаться

  Scenario: Пользователь должен зарегаться с разными данными в таблице
    Given Пользователь на странице регистрации
    When Пользователь должен ввести данные с таблицы
      | firstname | lastname  | dob  | email           | country | id   | money  |
      | John      | Doe       | 1990 | john@gmail.com  | USA     | 789  | 789987 |
      | Elon      | Musk      | 1980 | musk@tesla.com  | USA     | 456  | 123321 |
      | Mark      | Zukenberg | 1978 | mark@fb.com     | USA     | 321  | 445611 |
      | Steve     | Jobs      | 1960 | steve@apple.com | KGZ     | 3211 | 98744  |
      | Donald    | Trump     | 1950 | trump@com.com   | USA     | 3212 | 98714  |
      | Obama     | Barak     | 1955 | obama@gmail.com | USA     | 3213 | 91744  |
    Then Пользователь должен успешно зарегаться




