package Page.LandingPAge;

import Page.BasePage;
import WebDriver.Web;
import org.openqa.selenium.By;
import org.testng.Assert;

public class landingPage extends BasePage {

    By contactUs = By.xpath("//body/div[@id='dm']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]");
    By nameID = By.id("1177452198");
    By emailID = By.id("1052425816");


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
    }

}
