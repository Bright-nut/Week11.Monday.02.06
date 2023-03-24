package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookAddressVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String email = "ochadli@hotmail.com";
        String password = "12345";

        driver.get("https://www.facebook.com");
        /**when i need to find an element its better to go with ID for locating elements */
        /** 1) ask seleniem to find the email box
         * 2) write my email in the email box*/
        //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email or phone number" autofocus="1" aria-label="Email or phone number">
        WebElement emailBox =driver.findElement(By.id("email"));

        //send my email
        emailBox.sendKeys(email); //using the email directly is called hard coding adn its not liked

        // pw box
        // using cssSelector = "tag=input[attribute/value = type='password']"
        WebElement pwBox =driver.findElement(By.cssSelector("input[type='password']"));
        pwBox.sendKeys(password);

        // <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button"
        // type="submit" id="u_0_5_3w">Log In</button>
        //WebElement login = driver.findElement(By.cssSelector("botton[type='submit']")); //using cssSelector
         WebElement login = driver.findElement(By.name("login")); // using name
        //WebElement loginBotton= driver.findElement(By.id("u_0_5_3w")); // using Id
        login.click();
        driver.quit();








    }
}
