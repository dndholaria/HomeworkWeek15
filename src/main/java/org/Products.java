package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class Products {
    ////static web driver
    protected static WebDriver driver;

    //main method
    public static void main(String[] args) {

        //method sets the system property indicated by the specified key.
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");

        //object driver for chromedriver - through typecasting
        driver = new ChromeDriver();


        //command using which you can maximize browser window in selenium test. driver.manage
        driver.manage().window().maximize();

        //command to get URL
        driver.get("https://demo.nopcommerce.com/");

        //command to go to computer and click

        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a")).click();

        driver.findElement(By.xpath("//a[@title=\"Show products in category Desktops\"]")).click();

        //command to go to first item and get the text using X Path
        String name1 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]")).getText();


        System.out.println("Name of first item is: "+name1);

        //command to go to 2nd item and get the text using X Path
        String name2= driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();

        System.out.println("Name of second item is: "+name2);

        //command to go to 3rd item and get the text using X Path
        String name3 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();

        System.out.println("Name of third item is: "+name3);

        //to close the open webpage
        driver.quit();

    }
}