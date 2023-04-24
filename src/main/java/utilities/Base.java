package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

public class Base {
    //General
    protected static WebDriver driver;
    protected static Actions action;
    protected static WebDriverWait wait;
    protected static SoftAssert softAssert;
    protected static Screen screen;



    //Web

    protected static pageObjects.MainPage mainPage;
    protected static pageObjects.JobPage jobPage;
    protected static pageObjects.CVPage cvPage;
    protected static pageObjects.SearchJobs searchJobs;
    protected static pageObjects.LinkdeinJobNet linkdeinJobNet;


}
