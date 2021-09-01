package Page;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BasePage implements ITestListener {

    public void onTestFail(ITestResult result){
        System.out.println("Test failed");
        screenshot("No_Name");
    }

}
