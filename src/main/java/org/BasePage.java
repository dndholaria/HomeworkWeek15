package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class BasePage
{

    //static web driver
    protected static WebDriver driver;

    //Main method

    public static void main(String[] args)
    {

        //method sets the system property indicated by the specified key.
        System.setProperty("webdriver.chrome.driver", "src/test/java/driver/chromedriver.exe");

        //object driver for chromedriver - through typecasting
        driver = new ChromeDriver();

        //time stamp.  This unique due to current time.
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

        //Print statement to print time stamp
        System.out.println(timeStamp);

        //command using which you can maximize browser window in selenium test. driver.manage
        driver.manage().window().maximize();

        //command to get URL
        driver.get("https://demo.nopcommerce.com/");

        //command to locate register and click on above URL
        driver.findElement(By.className("ico-register")).click();

        //Command to locate first name and type Rajesh on registration page
        driver.findElement(By.id("FirstName")).sendKeys("Rajesh");

        //Command to locate last name and type Patel on registration page
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        //Command to locate email by id and type email address as per sendKeys on registration page
        driver.findElement(By.id("Email")).sendKeys("dn"+timeStamp+"@gmail.com");

        //Command to locate password by id and type password as per sendKeys on registration page
        driver.findElement(By.id("Password")).sendKeys("123456");

        //Command to locate confirm password by id and type password as per sendKeys on registration page
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        //command to locate registration button by id locator and click on registration
        driver.findElement(By.id("register-button")).click();

        //command to locate message if registration success
        String regMsg = driver.findElement(By.className("result")).getText();

        // print statement to print text after successful registration
        System.out.println(regMsg);

        //to close the open webpage
        driver.quit();

    }






}
