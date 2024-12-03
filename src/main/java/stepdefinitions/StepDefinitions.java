package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;

public class StepDefinitions {

    @Given("User login with name={name} userName")
    public void userLoginWithName(String name) {
        System.out.println("Logged in user: " + name);
    }

    @When("User login with string={string} userName")
    public void userLoginWithUserName(String name) {
        System.out.println("Logging in with name: " + name);
    }

    @When("User goes to {page} page")
    public void userGoToPage(String name) {
        System.out.println("Logging in with name: " + name);
    }

    @When("User {name} develops {page} page")
    public void userDevelopPage(String name, String page) {
        System.out.println("Logging in with name: " + name);
    }
}

