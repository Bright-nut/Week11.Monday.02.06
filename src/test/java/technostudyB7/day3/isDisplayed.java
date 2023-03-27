package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /**-------TEST CASE----
         * go the website below
         *verify if the hidden test is displayed
         *clock on start button
         * verification*/
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        // <div id="start"> <button>Start</button></div>
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        // <div id="finish" style=""> <h4>Hello World!</h4>
        WebElement hiddenText= driver.findElement(By.cssSelector("#finish>h4"));

        System.out.println("before click on start button: "+ hiddenText.isDisplayed());
        startButton.click();
        Thread.sleep(7000); // because once i click on start on the website
                                 // it takes a moment  to load, so using the thread will help wait
        System.out.println("after clicking on start button"+hiddenText.isDisplayed());

    }
}
