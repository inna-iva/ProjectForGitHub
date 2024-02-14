package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.99-bottles-of-beer.net/");
        driver.getTitle();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement startButton = driver.findElement(By.xpath("//*[@id='menu']/li[3]/a"));
        startButton.click();
        WebElement inputName = driver.findElement(By.name("search"));
        inputName.sendKeys("english");
        WebElement goButton = driver.findElement(By.name("submitsearch"));
        goButton.click();

        boolean isLanguageVisible = driver.findElement(By.xpath("//a[@href='/language-english-966.html']")).isDisplayed();

//        WebElement resultLink = driver.findElement(By.xpath("//a[@href='/language-english-966.html']"));
//        resultLink.getText();

        driver.quit();
    }
}
