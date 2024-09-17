package stepDefination;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;

public class HomePage {

    @Given("^user navigates the login page$")
    public void user_navigates_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signin_link();

    }

    @Given("^user navigates to the online products page$")
    public void user_navigates_to_the_online_products_page()throws InterruptedException {
        click_hamburger_menu();
        click_on_lineproducts();

    }


    }

