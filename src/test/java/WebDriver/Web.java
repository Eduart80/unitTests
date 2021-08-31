package WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.concurrent.TimeUnit;
public class Web {
    public static WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver","./chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.zedy3d.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void quitDriver(){driver.quit();}

    public static WebDriver getDriver(){return driver;}

}
