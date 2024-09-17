package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.LoggedinPage.*;
import static pages.LoginPage.*;

public class LoggedinPage {

    @Then("^user should be able to view the product category page$")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException{
        visibility_formalshoes();
        visibility_sneakers();
        visibility_sportsshoes();


    }


}
