package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Ma;

import java.util.List;
import java.util.Map;

public class DataTableSteps {


    @Given("^Пользователь на странице регистрации$")
    public void пользователь_на_странице_регистрации() {
        System.out.println("Я зашёл на страницу регистрации");
    }

    @When("^Пользователь должен ввести данные$")
    public void пользователь_должен_ввести_данные(DataTable table) {
        List<List<String>> userList = table.asLists(String.class);
        for (List<String> e : userList) {
            System.out.println(e);
        }
    }

    @Then("^Пользователь должен нажать на кнопку Регистрация$")
    public void пользователь_должен_нажать_на_кнопку_Регистрация() {
        System.out.println("Пользователь нажал на кнопку регистр");
    }

    @Then("^Пользователь должен успешно зарегаться$")
    public void пользователь_должен_успешно_зарегаться() {
        System.out.println("Я успешно зарегался");
    }

    @When("^Пользователь должен ввести данные с таблички$")
    public void пользователь_должен_ввести_данные_с_таблички(DataTable table) {

        List<Map<String, String>> userList = table.asMaps(String.class, String.class);

        for (Map<String, String> e : userList) {
            System.out.println(e.get("firstname"));
            System.out.println(e.get("lastname"));
            System.out.println(e.get("dob"));
            System.out.println(e.get("email"));
            System.out.println(e.get("country"));
            System.out.println(userList.get(3).get("email"));
        }

    }

    @When("^Пользователь должен ввести данные с таблицы$")
    public void пользователь_должен_ввести_данные_с_таблицы(DataTable table) {
        List<Map<String, String>> userList = table.asMaps(String.class, String.class);
        for (Map<String, String> e : userList) {
            if (e.get("firstname").equals("Donald")) {
                System.out.println(e.get("firstname"));
            }
        }
    }

}
