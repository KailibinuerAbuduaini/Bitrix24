package tests;
/*
Launch Chrome browser.
Maximize the browser.
Open URL: www.javatpoint.com
Scroll down through the web page
Click on "Core Java" link from the Java Technology section.
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        // we have to set up based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();

        // create object for using selenium driver;
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to("http://www.javatpoint.com/");
        //maximize window
        driver.manage().window().maximize();
        //wait 3 second
        Thread.sleep(3000);
       driver.findElement(By.xpath("//img[@*='Core Java tutorial']/following::p")).click();


    }
}
