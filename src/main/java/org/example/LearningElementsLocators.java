package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningElementsLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        By categoryMenuWomen = By.cssSelector("a[href=\"#Women\"]");
        By mainLogo = By.cssSelector("img[src=\"/static/images/home/logo.png\"]");
        By sliderCarousel = By.id("slider-carousel");
        By sliderIndicator = By.className("carousel-indicators");
        By button = By.tagName("button");
        By iframe = By.name("aswift_2");
        By videoTutorial = By.linkText(" Video Tutorials");
        By signupLogin = By.partialLinkText("Signup");
        By featuresItems = By.linkText("Features Items");
        By blueTopImg = By.cssSelector("img[src=\"/get_product_picture/1\"]");
        By menTshirtImg = By.partialLinkText("img[src=\"/get_product_picture/2\"]");
        By sleevelessDressImg = By.cssSelector("img[src=\"/get_product_picture/3\"]");
        By brandProducts = By.cssSelector("a[href=\"/brand_products/Polo\"]");
        By headerMiddle = By.className("header-middle");
        By brandProductsPolo = By.cssSelector("a[href=\"/brand_products/Polo\"]");
        By brandBabyhug = By.cssSelector("a[href=\"/brand_products/Babyhug\"]");
        By apisListForPractiseText = By.linkText("APIs List for practice");
        By singleWidgetText = By.cssSelector("div[class=\"single-widget\"]");
        //By youtubePlayIcon = By.cssSelector("i[class=\"fa fa-youtube-play\"]");
        By contactUs = By.partialLinkText("contact");
        //By signUpLoginIcon = By.linkText("fa fa-lock");a
        //By brandsMadame = By.linkText("brand_products/Madame");
        //By brandsBiba = By.linkText("brand_products/Biba");
        By login = By.cssSelector("a[href=\"/login\"]");
        //By input = By.tagName("submit-button");
        By formRow = By.cssSelector("div[class=form-row]");
        By viewport = By.name("viewport");
        By description = By.name("description");
        By robots = By.name("robots");
        By keywords = By.name("keywords");


        //By logoPullLeft = By.className("logo pull-left");
        //By homeIcon = By.className("fa fa-home");


    }
}
