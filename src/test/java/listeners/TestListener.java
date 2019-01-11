package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public TestListener() {
        System.out.println("Test3Listener constructor");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " +result.getStartMillis() + " "+result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success: "+result.getEndMillis());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: "+result.getTestName() + " "+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped. "+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Context Name = "+context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println(context.getPassedTests());
    }
}
