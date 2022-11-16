package Project3comherokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowser {
    static String browser = "chrome";
    static String baseurl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {

        //set up of browsers
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Enter invalid browser name");
        }

        //open url
        driver.get(baseurl);
        //print the tittle of the page
        System.out.println("tittle of the page is" + driver.getTitle());
        //print url
        System.out.println("current url is" + driver.getCurrentUrl());
        //print the page source
        System.out.println("page source is" + driver.getPageSource());

        //enter username in field
        WebElement usernamefield = driver.findElement(By.name("username"));
        usernamefield.sendKeys("manishap");

        //enter password in field
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("password123");

        //closing
        driver.quit();


    }
}
