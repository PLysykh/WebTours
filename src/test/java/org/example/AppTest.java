package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static java.lang.System.out;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.setProperty("chromedriver", "C:\\Program Files\\chromedriver_win32");
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement box = driver.findElement(By.id("checkboxes"));
        box.click();
        driver.manage().deleteAllCookies();
    }
}

//      WebElement selectElement = driver.findElement(By.className("ui-ba5"));
//      Select selectObject = new Select(selectElement);


//        for(WebElement i:linklist){
//            i.click();
//            System.out.println(i);
//        driver.findElement(By.className("ui-ab6")).click();
//        driver.manage().deleteAllCookies();
//        driver.quit();



