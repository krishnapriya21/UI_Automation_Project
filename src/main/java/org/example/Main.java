package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    static WebDriver driver=new ChromeDriver();

    public static void main(String[] args) {

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//a[text()='Login']"));
        Actions action=new Actions(driver);
        //mouse hover
        action.build().perform();
        //hold
        driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("New to Flipkart? Create an account"))));
        

        System.out.println("Hello world!");
        driver.quit();
    }
}