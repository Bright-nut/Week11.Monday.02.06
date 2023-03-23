package technostudyB7.day1;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1- browser driver set up/WebManager is good to setup up the chrome driver
        WebDriverManager.chromedriver().setup();
        //2- create object of ChromeDriver to open the browser
        //webdriver id and interface and chrome driver is a class!!
        WebDriver driver= new ChromeDriver();
        //3- go to google page
        driver.get("https://www.google.com");
        driver.getTitle();
        //we need to print to see what is the title of the website
        System.out.println("Title of the driver is: "+driver.getTitle());
        System.out.println("The current Url of the driver is: "+driver.getCurrentUrl());
        // we can navigate the same driver to go to multiple websites
        driver.navigate().to("https://www.techno.study");
        // to verify to that the driver is going to techno after google
        // suppose that I was given the title,
        String expectedtitle = "Industry-Driven Online IT Bootcamp | Techno Study";
       String actualTitle =driver.getTitle();
        //im going to do verification
        if (expectedtitle.equals(actualTitle)){
            System.out.println("verification is done: PASS");
            System.out.println("Actual title is: "+actualTitle);
        }else {
            System.out.println("Verification is : Fail");
            System.out.println("actual title is: "+actualTitle);
        }


    }

}
