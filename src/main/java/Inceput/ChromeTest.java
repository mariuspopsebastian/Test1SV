package Inceput;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class ChromeTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "F://Documente//Selenium//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.get("https://yak-83.svi.voalte.net/messenger/#/login");
        driver.findElement(By.id("username")).sendKeys("pop6");
        driver.findElement(By.id("password")).sendKeys("1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Thread.sleep(500);
        WebDriverWait a = new  WebDriverWait(driver, 6);
        a.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='shiftRole']/section/form/ul/li[8]/label")));
        driver.findElement(By.xpath(".//*[@id='shiftRole']/section/form/ul/li[8]/label")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Thread.sleep(500);
        WebDriverWait b = new  WebDriverWait(driver, 6);
        b.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='shiftTarget']/section/form/button")));
        driver.findElement(By.xpath(".//*[@id='shiftTarget']/section/form/button")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath(".//*[@id='shiftRoom']/section/form/ul/li/ul/li[1]/fieldset/label")).click();
        driver.findElement(By.xpath("//button[@translate='shift_selection.continue_button']")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//label[@for='checkB6R']")).click();
        driver.findElement(By.xpath("//button[@translate='shift_selection.continue_button']")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//button[@class='btn btnGreen btnContinue ng-scope']")).click();
        WebDriverWait d = new  WebDriverWait(driver, 6);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@id='status']")));
        driver.findElement(By.xpath(".//a[@id='status']")).click();
        driver.findElement(By.xpath(".//*[@id='statMenuLogout']/span")).click();
        driver.findElement(By.xpath(".//*[@id='logoutModal']/div[3]/button[2]")).click();
        System.out.println("!!!User logged out of the app with success!!!");



        //driver.findElement(By.xpath("//[@id='shiftRole']/section/form/ul/li[2]/label")).click();
        //int count = driver.findElements(By.xpath(".//*[@id='shiftRole']/section/form/ul/li[8]/label")).size();

       /*r (int i = 8; i < count; i++) {
            //driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
            String text = driver.findElements(By.xpath(".//*[@id='shiftRole']/section/form/ul/li[8]/label")).get(8).getAttribute("value");
            if (text.equals("U/S-Role5")) {
                driver.findElements(By.xpath(".//*[@id='shiftRole']/section/form/ul/li[8]/label")).get(8).click();
            }

        }*/

    }

}
