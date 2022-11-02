package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComment
{
    ////static web driver
    protected static WebDriver driver;

    //Main method
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

        driver.findElement(By.xpath("//div[@class=\"news-list-homepage\"]/div[2]/div[2]/div[3]/a")).click();

        //command to find Title using xpath locator and enter title.

        driver.findElement(By.xpath("//input[@class=\"enter-comment-title\"]")).sendKeys("feedback");

        //command to find comment box using id locator and enter comment

        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Very important news");

        //command to click on add comment by name locator and click on it.

        driver.findElement(By.name("add-comment")).click();

        //find the message appear after successful adding comment and note down the successful message using get text.
        String comment = driver.findElement(By.className("result")).getText();

        //print message
        System.out.println("Message appeared after successful adding comment : "+comment);


        //to close the open webpage
        driver.quit();
























    }
}
