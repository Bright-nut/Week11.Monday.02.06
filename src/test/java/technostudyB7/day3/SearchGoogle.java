package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        /**go to google page
         * locate search box
         * send bamboo pen key in the box
         * get the title of the new opened page
         * do verification with actual and expected one*/

        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-activedescendant="" aria-autocomplete="both" aria-controls="suggestions_list_container" aria-expanded="true" aria-haspopup="both" aria-owns="suggestions_list_container" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search"
        // data-ved="0ahUKEwjjnpHk0_X9AhXRI30KHQ_PDbgQ39UDCAc">
        WebElement searchBox = driver.findElement(By.className("gLFyf"));

        searchBox.sendKeys("Bamboo pen" + Keys.ENTER);

        //getting the title
        String actTitle = driver.getTitle();
        String expTitle = "Bamboo pen - Google Search";

        if (expTitle.equals(actTitle)) {
            System.out.println("verificaions is done:PASS");
            System.out.println("Actual title is: " + actTitle);
        } else {
            System.out.println("Verification failed");
            System.out.println("actual title is : " + actTitle);
        }

        driver.quit();


    }
}
