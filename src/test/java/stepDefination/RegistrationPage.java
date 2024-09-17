package stepDefination;

import io.cucumber.java.en.Then;

import static pages.RegistrationPage.visibility_header;

public class RegistrationPage {

    @Then("user should be able to view the registration page")
    public void user_should_be_able_to_view_the_registration_page() throws InterruptedException {
        visibility_header();
    }
}
