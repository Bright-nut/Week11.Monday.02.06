package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study"); // get() method wait the page for loading
        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com"); // navigate().to() does not wait
        driver.navigate().forward();

        // finding webelement of FB page(Connect with friends and the world around you on Facebook.)
        WebElement sloganText = driver.findElement(By.className("_8eso")); // the By is the class method

        String expSloganText = "Connect with friends and the world around you on Facebook.";
        String actSloganText = sloganText.getText(); // must convert the webelement to text using .getText()

        if(expSloganText.equals(actSloganText)){
            System.out.println("verification is done:PASS");
            System.out.println("the slogan text is: "+ actSloganText);
        }else {
            System.out.println("verificatio is FAILED");
            System.out.println("the slogan text is: "+ actSloganText);

        }
    }
}
