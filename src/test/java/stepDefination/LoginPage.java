package stepDefination;
import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signin_link;
import static pages.LoginPage.*;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

    @When("^user successfully enters the log in details$")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException{
        //click_hamburger_menu();
        //click_signin_link();
        send_keys_user();
        send_keys_pwd();
        click_btn();
    }


   // @Then("^user should be able to view the product category page$")
    //public void user_should_be_able_to_view_the_product_category_page(){


    @When("^user clicks on new registration button$")
    public void user_clicks_on_new_registration_button() throws InterruptedException{
        click_reg_btn();
    }



    //}



}
