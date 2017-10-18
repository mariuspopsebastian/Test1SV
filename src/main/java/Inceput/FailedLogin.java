package Inceput;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class FailedLogin {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "F://Documente//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://yak-83.svi.voalte.net/messenger/#/login");
        driver.findElement(By.id("username")).sendKeys("pop6");
        driver.findElement(By.id("password")).sendKeys("2");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String login_error_message = driver.findElement(By.xpath("//div[@message='Authentication Failed']")).getText();
        String expect="Authentication Failed";
        Assert.assertEquals(login_error_message,expect);
        System.out.println("!!!Error message validated with success!!!");


    }
}
