package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCategories

{   ////static web driver
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

        //command to copy name of 'Computer' category using xpath and print

        String computer = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a")).getText();
        System.out.println("Name of first category= "+computer);

        //command to copy name of 'Electronics' category using xpath and print
        String electronics = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a")).getText();
        System.out.println("Name of second category= "+electronics );

        //command to copy name of 'Apparel' category using xpath and print
        String apparel= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[3]/a")).getText();
        System.out.println("Name of third category= "+apparel );

        //command to copy name of 'Digital Download' category using xpath and print
        String digitalDownload= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[4]/a")).getText();
        System.out.println("Name of fourth category= "+digitalDownload );


        //command to copy name of 'Books' category using xpath and print
        String books= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]/a")).getText();
        System.out.println("Name of fifth category= "+books);

        //command to copy name of 'Jewelry' category using xpath and print

        String jewelry= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[6]/a")).getText();
        System.out.println("Name of sixth category= "+jewelry );

        //command to copy name of 'Gift cards' category using xpath and print

        String giftCards= driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[7]/a")).getText();
        System.out.println("Name of seventh category= "+giftCards );

        //to close the open webpage
        driver.quit();

    }
}
