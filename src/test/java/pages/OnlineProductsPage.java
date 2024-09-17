package pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage extends BrowserDriver {

    public static String formalshoes_dropdown="formalshoedropdown";
    public static String formal_shoes_webtable="/html/body/div[2]/table";
    public static String formalshoes_webtable_tr="/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static void click_formalshoes_dropdown(){
        driver.findElement(By.className(formalshoes_dropdown)).click();
    }

    public static void get_text_formal_shoes_first_value() {
        String actual_value = driver.findElement(By.xpath(formalshoes_webtable_tr)).getText();
        assertEquals(actual_value, "   Classic Cheltenham");
    }
}
