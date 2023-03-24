package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demmo.seleniumeasy.com");
        //<input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement sum1 = driver.findElement(By.id("sum1"));
        sum1.sendKeys(Integer.toString(6));
        //<input type="text" class="form-control" placeholder="Enter value" id="sum2">/
        WebElement sum2 = driver.findElement(By.id("sum2"));
        sum2.sendKeys(Integer.toString(6));
        //<button type="button" onclick="return total()" class="btn btn-default">Get Total</button>/
        WebElement getValue = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getValue.click();
        //<span id="displayvalue">13</span>/
        WebElement valueTotal = driver.findElement(By.id("displayvalue"));
        System.out.println(valueTotal.getText());
        int value1 = 7;
        int value2 = 6;
        int sum = value1 + value2;
        String expctResult = Integer.toString(sum);
        String actresult = valueTotal.getText();
        if (expctResult.equals(valueTotal.getText())) {
            System.out.println("Verification of Value: ✅PASSED✅");
        } else {
            System.out.println("Verification Value: ❗️FAILED");
            System.out.println("Actual  Value  is: " + "'" + valueTotal.getText() + "'");
        }


    }
}
