@Regression
Feature: Покупка Lexus


  Background: Вход в Мир Lexus
    Given Я зашел на сайт "Lexus.com"
    And Я должен ввести zipcode 0312

  Scenario: Покупка Lexus Lx570
    And Я должен пролистать вниз и должен увидеть "Explore your Lexus"
    And Я должен выбрать модель "LX"
    And Я должен увидеть последний модель "lx570"
    And Цена должна начинаться с 86930 долларов
    When Когда я нажал кнопку build
    And Сайт должен запросить zipCode
    And Я должен выбрать модель "2021 LX 570 THREE-ROWS"
    And Вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
    And Цена "lx570" поменяться с 93700 на 93275
    And Я должен нажать на кнопку Summary
    And Я должен увидеть "YOU'LL TURN HEADS" такой текс
    And Я должен нажать на кнопку Send to dealer
    And Сайт выдал анкету для заполнения
    And В поле First name я должен ввести "Murat"
    And В поле Last name я должен ввести "Shorukov"
    And В поле Email я должен ввести "shorukov.murat94@gmail.com"
    And В поле Phone number должен ввести 996555111222
    Then Я должен нажать на кнопку Submit
    Then Я должен увидеть надпись "THANK YOU. WE'LL BE IN TOUCH SHORTLY"

    Scenario: Купить RX350
      Given Я должен пролистать вниз и должен увидеть "Explore your Lexus"
      And Я должен выбрать модель "RX"
      And Я должен увидеть последний модель "rx350"
      And Цена должна начинаться с 45320 долларов
      When Когда я нажал кнопку build
      And Сайт должен запросить zipCode
      And Я должен выбрать модель "2021 RX 350 THREE-ROWS"
      And Вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
      And Цена "rx350" поменяться с 45370 на 50000
      And Я должен нажать на кнопку Summary
      And Я должен увидеть "YOU'LL TURN HEADS" такой текс
      And Я должен нажать на кнопку Send to dealer
      And Сайт выдал анкету для заполнения
      And В поле First name я должен ввести "Murat"
      And В поле Last name я должен ввести "Shorukov"
      And В поле Email я должен ввести "shorukov.murat94@gmail.com"
      And В поле Phone number должен ввести 996555111222
      Then Я должен нажать на кнопку Submit
      Then Я должен увидеть надпись "THANK YOU. WE'LL BE IN TOUCH SHORTLY"


      Scenario: Купить LS430
        Given Я должен пролистать вниз и должен увидеть "Explore your Lexus"
        And Я должен выбрать модель "LS"
        And Я должен увидеть последний модель "ls430"
        And Цена должна начинаться с 70000 долларов
        When Когда я нажал кнопку build
        And Сайт должен запросить zipCode
        And Я должен выбрать модель "2021 LS 430 TRHEE-ROWS"
        And Вкладке "EXTERIOR COLORS" я должен выбрать "Black Onyx"
        And Цена "ls430" поменяться с 70000 на 80000
        And Я должен нажать на кнопку Summary
        And Я должен увидеть "YOU'LL TURN HEADS" такой текс
        And Я должен нажать на кнопку Send to dealer
        And Сайт выдал анкету для заполнения
        And В поле First name я должен ввести "Murat"
        And В поле Last name я должен ввести "Shorukov"
        And В поле Email я должен ввести "shorukov.murat94@gmail.com"
        And В поле Phone number должен ввести 996555111222
        Then Я должен нажать на кнопку Submit
        Then Я должен увидеть надпись "THANK YOU. WE'LL BE IN TOUCH SHORTLY"
