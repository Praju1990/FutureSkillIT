package Selenium_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Selenium {
    public static void main(String[]args){
        WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.flipkart.com/");
            System.out.println("url of the page ="   +  driver.getCurrentUrl() );
            System.out.println("Title of the page ="   + driver.getTitle());;

driver.get("https://facebook.com/");
System.out.println("url of the page ="   +  driver.getCurrentUrl() );
System.out.println("Title of the page ="   + driver.getTitle());;

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.manage().window().minimize();
        driver.quit();

    }
}
