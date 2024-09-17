package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

import static pages.HomePage.click_hamburger_menu;
import static pages.HomePage.click_signin_link;

public class LoginPage extends BrowserDriver {

    public static String user_textbox="//*[@id='usr']";
    public static String  user_password="//*[@id='pwd']";
    public static String click_btn="//*[@id='second_form']/input";
    public static String registration_btn_id="NewRegistration";

    public static void send_keys_user() throws InterruptedException {
        driver.findElement(By.xpath(user_textbox)).sendKeys("sa");

    }

    public static void send_keys_pwd() throws InterruptedException {
        driver.findElement(By.xpath(user_password)).sendKeys("sa");
    }


    public static void click_reg_btn() throws InterruptedException {
        driver.findElement(By.id(registration_btn_id)).click();
    }

    public static void click_btn(){

        driver.findElement(By.xpath(click_btn)).click();

    }



}
