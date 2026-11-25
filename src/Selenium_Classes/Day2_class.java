package Selenium_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day2_class {
    static void main(String[]args){
//        WebDriver driver = new ChromeDriver() ;
//        driver.manage().window().maximize();
//        driver.get("https://demowebshop.tricentis.com/");
//        driver.findElement(By.linkText("Log in")).click();
//        driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
//        driver.findElement(By.name("Password")).sendKeys("abc@123");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        //driver.findElement(By.partialLinkText("Books")).click();
        List<WebElement>links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());



    }
}
