package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {

    public static String user_registration="/html/body/center/h1";

    public static void visibility_header() throws InterruptedException{
        Thread.sleep(2000);
        String actual_product=driver.findElement(By.xpath(user_registration)).getText();
        assertEquals(actual_product,"User Registration Page");



    }





}
