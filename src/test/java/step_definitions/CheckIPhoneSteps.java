package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckIPhoneSteps {
    @Given("^Я как пользователь должен открыть сайт Facebook\\.com$")
    public void я_как_пользователь_должен_открыть_сайт_Facebook_com() throws Throwable {
        System.out.println("here1");
    }

    @Given("^Пользователь должен вести в поле email свой email адрес$")
    public void пользователь_должен_вести_в_поле_email_свой_email_адрес() throws Throwable {
        System.out.println("here2");
    }

    @Given("^Пользователь должен вести в поле пароль свой Пароль$")
    public void пользователь_должен_вести_в_поле_пароль_свой_Пароль() throws Throwable {
        System.out.println("here3");
    }

    @When("^Пользователь нажметь на кнопку Логин$")
    public void пользователь_нажметь_на_кнопку_Логин() throws Throwable {
        System.out.println("here4");
    }

    @Then("^Пользователь должен благополучно войти в систему$")
    public void пользователь_должен_благополучно_войти_в_систему() throws Throwable {
        System.out.println("here5");
    }

    @Given("^Пользователь должен вести корректный email$")
    public void пользователь_должен_вести_корректный_email() throws Throwable {
        System.out.println("here6");
    }

    @Given("^Пользователь должен вести некорректный пароль$")
    public void пользователь_должен_вести_некорректный_пароль() throws Throwable {
        System.out.println("here7");
    }

    @When("^Пользователь нажмёт на кнопку Войти$")
    public void пользователь_нажмёт_на_кнопку_Войти() throws Throwable {
        System.out.println("here8");
    }

    @Then("^Пользователь не должен авторизоваться в системе$")
    public void пользователь_не_должен_авторизоваться_в_системе() throws Throwable {
        System.out.println("here9");
    }

    @Given("^Пользователь должен вести некорректный email$")
    public void пользователь_должен_вести_некорректный_email() throws Throwable {
        System.out.println("here10");
    }

    @Given("^Пользователь должен вести корректный пароль$")
    public void пользователь_должен_вести_корректный_пароль() throws Throwable {
        System.out.println("here11");
    }

    @Given("^Пользователь должен оставить строку email пустым$")
    public void пользователь_должен_оставить_строку_email_пустым() throws Throwable {
        System.out.println("here12");
    }

    @Given("^Пользователь должен оставить строку пароль пустым$")
    public void пользователь_должен_оставить_строку_пароль_пустым() throws Throwable {
        System.out.println("here13");
    }

    @Then("^Пользователю должно выйти сообщение чтобы он ввел данные$")
    public void пользователю_должно_выйти_сообщение_чтобы_он_ввел_данные() throws Throwable {
        System.out.println("here14");
    }





    // New Feature

    @Given("^Я должен зайти на сайт Svetofor\\.kg$")
    public void я_должен_зайти_на_сайт_Svetofor_kg() throws Throwable {
        System.out.println("Я зашёл на сайт Svetofor.kg");
    }

    @Given("^Я должен найти наушники для Iphone$")
    public void я_должен_найти_наушники_для_Iphone() throws Throwable {
        System.out.println("Я нашел AirPods");
    }

    @Given("^У меня на карте (\\d+) usd$")
    public void у_меня_на_карте_usd(int balance) throws Throwable {
        System.out.println("У меня на балансе " + balance);

    }

    @Given("^Наушники стоят (\\d+) usd$")
    public void наушники_стоят_usd(int headPhonePrice) throws Throwable {
        System.out.println("Стоимость наушников " + headPhonePrice);
    }

    @When("^Я нажимаю на кнопку купить$")
    public void я_нажимаю_на_кнопку_купить() throws Throwable {

        System.out.println("Я нажал на кнопку Купить");
    }

    @When("^Сайт должен снять с моей карты (\\d+) usd$")
    public void сайт_должен_снять_с_моей_карты_usd(int withDraw) throws Throwable {
        System.out.println("Сайт снял с моей карты " + withDraw + "USD");
    }

    @Then("^У маня на карте должен остаться (\\d+) usd$")
    public void у_маня_на_карте_должен_остаться_usd(int remainingBalance) throws Throwable {
        System.out.println(" У меня на карте осталось " + remainingBalance);
    }





    @Given("^Я должен открыть сайт Vk\\.com$")
    public void я_должен_открыть_сайт_Vk_com() throws Throwable {
        System.out.println("Я открыл сайт vk.com");
    }

    @Given("^Я должен вести свои логин (\\d+)$")
    public void я_должен_вести_свои_логин(int username) throws Throwable {
            System.out.println("Я ввел свой логин" + username);
    }

    @Given("^Я должен вести свой пароль (\\d+)$")
    public void я_должен_вести_свой_пароль(int password) throws Throwable {
        System.out.println("Я ввел свой пароль" + password);
    }

    @Given("^Я должен нажать на кнопку Войти$")
    public void я_должен_нажать_на_кнопку_Войти() throws Throwable {
        System.out.println("Я нажал на кнопку Войти");
    }

    @When("^Когда я нажал кнопку Войти программа должна проверить мой данные (\\d+) и (\\d+)$")
    public void когда_я_нажал_кнопку_Войти_программа_должна_проверить_мой_данные_и(long username, long password) throws Throwable {
        long name = 996555123123l;
        long pass = 789456321;
        if (username == name && password == pass) {
            System.out.println("Вы ввели корректные данные");
        } else {
            System.err.println("Вы ввели не корректные данные");
            System.exit(1);
        }
    }

    @Then("^Я должен благополучно зайти в систему$")
    public void я_должен_благополучно_зайти_в_систему() throws Throwable {
        System.out.println("Вы благополучно вошли на сайт");

    }
}
