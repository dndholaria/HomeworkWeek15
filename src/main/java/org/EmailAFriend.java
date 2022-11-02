package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class EmailAFriend
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

        //Command to find the product Apple MacBook Pro 13-inch using xpath and click.
        driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div[1]/div[2]/h2/a")).click();

        // command to locate email a friend using xpath and click on it.
        driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click();

        //command to locate friend email and enter email address of friend.
       driver.findElement(By.id("FriendEmail")).sendKeys("bipoin@gmail.com");

       //command to locate your email and enter email address of yours.
       driver.findElement(By.id("YourEmailAddress")).sendKeys("dbdholaria@gmail.com");

       //command to locate personal message and enter message you want to send to a friend
       driver.findElement(By.id("PersonalMessage")).sendKeys("Very nice deal to buy today");

       //command to locate send email element and click on it
       driver.findElement(By.name("send-email")).click();

       //Command to capture the message displayed after sending message to friend.
       String message = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
       System.out.println(message);

        //to close the open webpage
        driver.quit();
    }

}
