package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /**---------REAL TASK-----
         * go to seleniuemeasy website
         * go to input forms-> simple forms
         * type the a messeage in the message box
         * clock the show message button
         * verify the message*/
        driver.get("https://demo.seleniumeasy.com");
        //<input autofocus="" type="text" class="form-control" placeholder="Please
        // enter your Message" id="user-message">
        WebElement messageBox = driver.findElement(By.id("user-message"));
        messageBox.sendKeys("Hello world");
        //<button type="button" onclick="showInput();" class="btn btn-default">Show Message</button>
       // WebElement showMessageButton = driver.findElement(By.cssSelector("button[type='button']"));
        // by type the showMessageButton didnt work, so that is considered a bug
        WebElement showMessageButton = driver.findElement(By.className("btn btn-default"));
        showMessageButton.click();


        WebElement result = driver.findElement(By.id("display"));
        // if i run it like this it will show the html code
        System.out.println(result.getText());
        String expMessage = "Hello world";
        String actMessage = result.getText();
        if(expMessage.equals(actMessage)){
                        System.out.println("The verofocation is done:PASS");
                        System.out.println("The actual message is: "+ actMessage);
                    }else{
                        System.out.println("The Verification FAILED");
                        System.out.println("the actual message is: "+actMessage);
                    }

        driver.quit();


    }
}
