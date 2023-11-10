package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
        By locator = By.id("m-documentationtest_practices-li");
        WebElement element = driver.findElement(locator);
        element.click();



        driver.quit();
    }
}
