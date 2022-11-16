package Project3comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CromeBrowser {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launce Url
        driver.get(baseurl);
        //Maximize window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("page tittle is: " +driver.getTitle());

        //get current url
        System.out.println("current url :" + driver.getCurrentUrl());

        //find the emailField element
        WebElement emailfield = driver.findElement(By.id("username"));
        emailfield.sendKeys("Manishap");

        //Find the password field emements
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");

        driver.quit();

    }
}



