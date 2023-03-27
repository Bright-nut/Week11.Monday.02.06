package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /**go to dynamic controls
         * locate enable and click on it
         * do verification
         * */
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        // i must locate the box first and then the enable buttom
        //<form id="input-example">
        // the enableBox html code = <input type="text" style="width: 30%;" disabled="">
        // enable button html code = <button autocomplete="off" type="button" onclick="swapInput()">Enable</button><p id="message">It's disabled!</p><div id="loading" style="display: none;">Wait for it... <img src="/img/ajax-loader.gif"></div><br><div id="loading" style="display: none;">Wait for it... <img src="/img/ajax-loader.gif"></div><br>
        // this is a second way to write cssselector (using the parent and th child htm codes)
        WebElement enableButtom = driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        inputField.isEnabled();
        // another way to verify
        boolean isinputFieldEnabled = inputField.isEnabled();
        System.out.println(isinputFieldEnabled); // it should be fasle
        enableButtom.click();
        // because when i  manually click on the enable button it takes a while to load
        // so i must sleep the execution to make sure it doesnt not went into ech other
        Thread.sleep(5000);
        boolean isinputFieldEnabled2=inputField.isEnabled();
        System.out.println(isinputFieldEnabled2);








    }
}
