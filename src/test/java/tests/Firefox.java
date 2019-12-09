package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Firefox {
    public static void main(String[] args) {

// we have to set up based on the browser that we gonna use
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver = new FirefoxDriver();

        // Launch Website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //Click on the Link Text using click() command
        driver.findElement(By.xpath("//a[.='This is a link']")).click();

        //Go back to Home Page
        driver.navigate().back();

        //Go forward to Registration page
        driver.navigate().forward();

        // Go back to Home page
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //Refresh browser
        driver.navigate().refresh();

        //Closing browser
        driver.close();
    }
}

