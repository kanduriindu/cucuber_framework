package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {


   public static String hamburger_menu_path ="//input[@type='checkbox']";
   public static String signin_link_xpath="//*[text()='Sign In Portal']";
    public static String onlineproductspage="//*[@id='menu']/a[3]/li";


   public static void click_hamburger_menu() throws InterruptedException{
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
       Thread.sleep(2000);
       driver.findElement(By.xpath(hamburger_menu_path)).click();


   }

    public static void click_signin_link() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(signin_link_xpath)).click();


    }

    public static void click_on_lineproducts() throws InterruptedException{
        Thread.sleep(2000);
        driver.findElement(By.xpath(onlineproductspage)).click();


    }







}
