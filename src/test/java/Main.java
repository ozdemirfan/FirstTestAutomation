import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Tam ekran
        driver.manage().window().maximize();
        //Siteye git
        driver.get("https://demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");


        WebElement elementButton = driver.findElement(By.xpath("//h5[normalize-space()='Elements']"));
        elementButton.click();


        WebElement WebTables = driver.findElement(By.xpath("//span[normalize-space()='Web Tables']"));
        WebTables.click();

        WebElement AddButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        AddButton.click();

        WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        FirstName.click();
        FirstName.sendKeys("irfan");

        WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        LastName.click();
        LastName.sendKeys("özdemir");

        WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.click();
        Email.sendKeys("ozdemirfann@gmail.com");

        WebElement Age = driver.findElement(By.xpath("//input[@id='age']"));
        Age.click();
        Age.sendKeys("33");

        WebElement Salary = driver.findElement(By.xpath("//input[@id='salary']"));
        Salary.click();
        Salary.sendKeys("5");

        WebElement Department = driver.findElement(By.xpath("//input[@id='department']"));
        Department.click();
        Department.sendKeys("it");

        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();






        //driver.quit();


    }

}
