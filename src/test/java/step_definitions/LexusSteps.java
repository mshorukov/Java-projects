package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LexusSteps {


    @Given("^Я зашел на сайт \"([^\"]*)\"$")
    public void я_зашел_на_сайт(String lexusWebSite) {

        System.out.println("Я зашел на сайт " +  lexusWebSite);
    }

    @Given("^Я должен пролистать вниз и должен увидеть \"([^\"]*)\"$")
    public void я_должен_пролистать_вниз_и_должен_увидеть(String expectedText) {
        System.out.println("Я пролистал вниз и увидел тексе " + expectedText);
    }

    @Given("^Я должен выбрать модель \"([^\"]*)\"$")
    public void я_должен_выбрать_модель(String lexusModel) {
        System.out.println("Я выбрал модель " + lexusModel);
    }

    @Given("^Я должен увидеть последний модель \"([^\"]*)\"$")
    public void я_должен_увидеть_последний_модель(String lastLexusModel) {
        System.out.println("Я увидел последний модель " + lastLexusModel);
    }

    @Given("^Цена должна начинаться с (\\d+) долларов$")
    public void цена_должна_начинаться_с_долларов(int startingPrice) {
        System.out.println("Цена начинается с " + startingPrice + " долларов");
    }

    @When("^Когда я нажал кнопку build$")
    public void когда_я_нажал_кнопку_build() {

    }

    @When("^Сайт должен запросить zipCode$")
    public void сайт_должен_запросить_zipCode() {

    }

    @When("^Я должен ввести zipcode (\\d+)$")
    public void я_должен_ввести_zipcode(int zipCode) {
        System.out.println(zipCode);
    }
    
    @When("^Вкладке \"([^\"]*)\" я должен выбрать \"([^\"]*)\"$")
    public void вкладке_я_должен_выбрать(String colors, String lsColor) {

    }

    @When("^Цена \"([^\"]*)\" поменяться с (\\d+) на (\\d+)$")
    public void цена_поменяться_с_на(String lx570, int oldPrice, int newPrice) {

    }

    @When("^Я должен нажать на кнопку Summary$")
    public void я_должен_нажать_на_кнопку_Summary() {

    }

    @When("^Я должен нажать на кнопку Send to dealer$")
    public void я_должен_нажать_на_кнопку_Send_to_dealer() {

    }

    @When("^Я должен увидеть \"([^\"]*)\" такой текс$")
    public void я_должен_увидеть_такой_текс(String expectedText) {

    }

    @When("^Сайт выдал анкету для заполнения$")
    public void сайт_выдал_анкету_для_заполнения() {

    }

    @When("^В поле First name я должен ввести \"([^\"]*)\"$")
    public void в_поле_First_name_я_должен_ввести(String firstName) {

    }

    @When("^В поле Last name я должен ввести \"([^\"]*)\"$")
    public void в_поле_Last_name_я_должен_ввести(String lastName) {

    }

    @When("^В поле Email я должен ввести \"([^\"]*)\"$")
    public void в_поле_Email_я_должен_ввести(String email) {

    }

    @When("^В поле Phone number должен ввести (\\d+)$")
    public void в_поле_Phone_number_должен_ввести(int phoneNumber) {

    }

    @When("^Я должен нажать на кнопку Submit$")
    public void я_должен_нажать_на_кнопку_Submit() {

    }

    @Then("^Я должен увидеть надпись \"([^\"]*)\"$")
    public void я_должен_увидеть_надпись(String expectedText) {

    }
}
