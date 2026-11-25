package Selenium_Classes;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day1 {
    static void main(String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/register");

       WebElement  mr = driver.findElement(By.id("gender-male"));
       mr.click();
       WebElement fn = driver.findElement(By.id("FirstName"));
      fn.sendKeys("abc");
      driver.findElement(By.id("LastName")).sendKeys("a");
      driver.findElement(By.name("Email")).sendKeys("abc@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("abc@123");
      driver.findElement(By.name("ConfirmPassword")).sendKeys("abc@123");
      driver.findElement(By.id("register-button")).click();
    }
}
