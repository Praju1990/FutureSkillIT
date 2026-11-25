package Selenium_Classes;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day3_ {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/login");
        driver.findElement(By.cssSelector("#Email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector(".password")).sendKeys("abc@123");
//        driver.findElement(By.cssSelector("input[value=\"Log in\"]"))
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

    }
}

