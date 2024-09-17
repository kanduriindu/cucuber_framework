package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedinPage extends BrowserDriver {
    public static String formalshoes="//*[text()='Formal Shoes']";
    public static String sports_shoes="//*[text()='Sports']";
    public static String sneakers="//*[text()='Sneakers']";

    public static void visibility_formalshoes() throws InterruptedException{
        Thread.sleep(2000);
        String actual_product=driver.findElement(By.xpath(formalshoes)).getText();
        assertEquals(actual_product,"Formal Shoes");


    }

    public static void visibility_sportsshoes() throws InterruptedException{
        Thread.sleep(2000);
        String actual_product=driver.findElement(By.xpath(sports_shoes)).getText();
        assertEquals(actual_product,"Sports");


    }

    public static void visibility_sneakers() throws InterruptedException{
        Thread.sleep(2000);
        String actual_product=driver.findElement(By.xpath(sneakers)).getText();
        assertEquals(actual_product,"Sneakers");


    }

}
