package Page.LandingPAge;

import Page.BasePage;
import Page.ListenerClass;
import WebDriver.Web;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.IOException;
@Listeners(ListenerClass.class)

public class landingPage extends BasePage {

    By contactUs = By.xpath("//body/div[@id='dm']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
    By nameID = By.id("1177452198");
    By emailID = By.id("1052425816");
    By homePage = By.xpath("//body/div[@id='dm']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]");
    By mouseOver = By.xpath("//body/div[@id='dm']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]");

    TakesScreenshot sk =(TakesScreenshot)Web.getDriver();


    public void kape(String name){
        waitASec();
        String opa = Web.getDriver().getTitle();
        Assert.assertEquals(name, opa);
    }
    public void webSearch(){
        clickThis(contactUs);
    }
    public void fillForm(String name){
        enterField(nameID, name);
    }
    public void fillEmail(String name){
        enterField(emailID, name);
        Assert.assertEquals(emailID, "ANA@gmail.com");
        System.out.println("SSSS");
       screenshot("emailField");
    }

    public void homePage(){
        clickThis(homePage);
    }
    public void mouseOv() throws IOException{
        mouseOver(mouseOver);
       File source = sk.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(source, new File("./SceenShots/screenShot.png"));
       System.out.println("got screenshot");
    }

}
//File scrShot = ((TakesScreenshot)Web.getDriver()).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrShot, new File("Path to file"));