package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com/");

        // verification
        String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle = driver.getTitle();
         if(expectedTitle.equals(actualTitle)){
             System.out.println("verification is done: PASS");
             System.out.println("the actual title is: "+ actualTitle);
         }else{
             System.out.println("verification FAILED");
             System.out.println("the actual title is: "+actualTitle);
         }
         //ask selenium to wait before opening the nest page, we ask because of synchronization
        // if i had a slow internet,with a fast selenium it will give me "error" but its not a real error
        // ask selenium to wait using the hard way(not preferred)

        // THREAD is a class and it has sleep method.
        // there are 1000miliseconds in 1 second
        Thread.sleep(3000);
         // to navigate memorize the codes
        String teslaURL = "https://www.tesla.com";
        driver.navigate().to(teslaURL);
        // to tell selenium to maximize a page
        driver.manage().window().maximize();

        driver.close(); // will close one page once the job is done
        driver.quit(); // will close all pages once the job is done
    }
}
