package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (Info.browser.equalsIgnoreCase("Chrome")) {  //to launch in Chrome browser
            driver = new ChromeDriver();
        } else if (Info.browser.equalsIgnoreCase("Firefox")) {     //to launch in Firefox browser
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
