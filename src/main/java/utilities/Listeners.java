package utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Listeners extends CommonOps implements ITestListener {

    @Override
    public void onStart(ITestContext execution){
        System.out.println("----------Starting Execution---------");

    }


    @Override
    public void onFinish(ITestContext execution){
        System.out.println("----------Ending Execution---------");
    }


    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0){

    }


    @Override
    public void onTestSkipped(ITestResult test){
        System.out.println("----------Skipping Test:" + test.getName() + "---------");
    }


    @Override
    public void onTestStart(ITestResult test){
        System.out.println("----------Starting Test:" + test.getName() + "---------");
    }


    @Override
    public void onTestSuccess(ITestResult test){
        System.out.println("---------- Test:" + test.getName() + " Passed ---------");
        //Stop Recording
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Delete Recorder File
        File file = new File("./test-recordings/" + test.getName() + "avi");
        if (file.delete())
            System.out.println("file deleted successfully");
        else
            System.out.println("file is not deleted");
    }


    @Override
    public void onTestFailure(ITestResult test){
        System.out.println("---------- Test:" + test.getName() + " Failed ---------");
        //Stop Recording
        try {
            MonteScreenRecorder.stopRecord();
        } catch (Exception e) {
            e.printStackTrace();
        }
        saveScreenshots();
    }


    @Attachment(value = "Page Screen-shot", type = "image/png")
    public byte[] saveScreenshots(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
