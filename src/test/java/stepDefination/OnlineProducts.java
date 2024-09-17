package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static pages.OnlineProductsPage.click_formalshoes_dropdown;
import static pages.OnlineProductsPage.get_text_formal_shoes_first_value;

public class OnlineProducts {

    @When("user clicks on formal shoes dropdown")
    public void user_clicks_on_formal_shoes_dropdown() {
        click_formalshoes_dropdown();

    }
    @Then("user should be able to view the products")
    public static void user_should_be_able_to_view_the_products() throws InterruptedException {
        get_text_formal_shoes_first_value();

    }
}
