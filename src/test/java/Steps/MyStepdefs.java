package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    public MyStepdefs() {
    }

    @Given("user want to draw money")
    public void userWantToDrawMoney() {
        System.out.println("aaa");
    }

    @When("he enters username")
    public void heEntersUsername() {
        System.out.println("bbbb");
    }

    @Then("he takes out money")
    public void heTakesOutMoney() {
        System.out.println("ccccc");
    }
}
