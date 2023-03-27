package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /**visit the page
         * locate the check box
         * check the check box
         * verify if the desired check box is selected or not
         ***the above writing is what is called test case***/
        driver.get("https://www.seleniumeasy.com");
        // <input type= "checkbox" id=isAgeSelected>
        WebElement checkBox= driver.findElement(By.id("isAgeSelected"));
        checkBox.click();

        Thread.sleep(30000);
        //when using isSelected the return type is "boolean"
        if(checkBox.isSelected()){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }
        driver.quit();
    }
}
