package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
        try {
            URL url = new URL("https://www.google.com/");
            driver.navigate().to(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());



        driver.quit();


    }
}