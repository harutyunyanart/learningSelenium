package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnElementsWeb {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.list.am/en/");
        By locator = By.partialLinkText("Vehicles");

        WebElement cars = driver.findElement(locator);
        Thread.sleep(4000);
        cars.click();


    }
}
