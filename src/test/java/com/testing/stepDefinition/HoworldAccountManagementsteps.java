package com.testing.stepDefinition;

import com.testing.pageObject.EnterNameAndBirthdayPagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.testing.cucumber.Hooks.driver;

public class HoworldAccountManagementsteps {
    @Given("I am on how old are you page")
    public void iAmOnHowOldAreYouPage() {
        EnterNameAndBirthdayPagePO enterNameAndBirthdayPagePO = new EnterNameAndBirthdayPagePO(driver);

    }

    @When("I enter  {string} {string}")
    public void iEnter(String Name, String Birthday) {
        EnterNameAndBirthdayPagePO enterNameAndBirthdayPagePO = new EnterNameAndBirthdayPagePO(driver);
        enterNameAndBirthdayPagePO.enterInputName(Name);
        enterNameAndBirthdayPagePO.enterInputBirthday(Birthday);
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        EnterNameAndBirthdayPagePO enterNameAndBirthdayPagePO = new EnterNameAndBirthdayPagePO(driver);
        enterNameAndBirthdayPagePO.clickSubmitButton();
    }

    @Then("My Name and Birthday should displayed")
    public void myNameAndBirthdayShouldDisplayed() {
    }
}
