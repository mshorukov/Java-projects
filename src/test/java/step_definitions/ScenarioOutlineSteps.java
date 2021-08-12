package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutlineSteps {



    @Given("^Я как пользователь должен открыть сайт \"([^\"]*)\"$")
    public void я_как_пользователь_должен_открыть_сайт(String facebook) {
        System.out.println(" Я зашел на сайт Фейсбук");
    }

    @Given("^В поле email вводим email \"([^\"]*)\"$")
    public void в_поле_email_вводим_email(String emails) {
        System.out.println(" В поле email я ввел " + emails);
    }

    @When("^В поле пароль вводим \"([^\"]*)\"$")
    public void в_поле_пароль_вводим(String passwords) {
        System.out.println(" В поле passwords вожу " + passwords);
    }

    @Then("^Я должен нажать на кнопку войти в систему$")
    public void я_должен_нажать_на_кнопку_войти_в_систему() {
        System.out.println(" Я нажал на кнопку войти в систему");
    }

    @Then("^Система должна вывести ошибку \"([^\"]*)\"$")
    public void система_должна_вывести_ошибку(String errorMessage) {
        System.out.println(" Вы ввели неправильные данные");
    }

    @Given("^Я должен открыть сайт \"([^\"]*)\"$")
    public void я_должен_открыть_сайт(String vk) {
        System.out.println("Я открыл сайт " + vk);
    }

    @Given("^Я должен перейти на окно поиска$")
    public void я_должен_перейти_на_окно_поиска() {
        System.out.println(" Я открыл окно поиска");
    }

    @Given("^В поле имя я должен ввести \"([^\"]*)\"$")
    public void в_поле_имя_я_должен_ввести(String username) {
        System.out.println(" В поле имя я ввел " + username);
    }

    @Given("^В поле фамилия я должен ввести \"([^\"]*)\"$")
    public void в_поле_фамилия_я_должен_ввести(String lastname) {
        System.out.println("В поле фамилия я ввел " + lastname);
    }

    @When("^Я должен нажать на кнопку поиск$")
    public void я_должен_нажать_на_кнопку_поиск() {
        System.out.println("Я нажал на кнопку Найти");
    }

    @Then("^Система должна показать людей \"([^\"]*)\" и \"([^\"]*)\" \\+ и его идентификационный номер (\\d+)$")
    public void система_должна_показать_людей_и_и_его_идентификационный_номер(String username1, String lastname1, int id) {
        System.out.println("Система нашла мне таких людей " + username1 + " " + lastname1 + "и его идентификационный номер " + id);
        System.out.println("" +
                "");
    }

}
