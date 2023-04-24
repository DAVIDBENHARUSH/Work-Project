package extansions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class UIActions extends CommonOps {
    @Step("click on element")
    public static void click(WebElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.click();
    }
    @Step("update text element")
    public static void updateText(WebElement elem, String text) {
        try {
            wait.until((ExpectedConditions.visibilityOf(elem)));
            elem.sendKeys(text);
        } catch (TimeoutException e) {
            elem.sendKeys(text);
        }
    }
    @Step("mouse hover element")
    public static void mouseHover(WebElement elem1, WebElement elem2) {
        action.moveToElement(elem1).moveToElement(elem2).click().build().perform();
    }
    @Step("drop down element")
    public static void updateDropDown(WebElement elem, String text) {
        try {
            wait.until((ExpectedConditions.visibilityOf(elem)));
            Select dropDown = new Select(elem);
            dropDown.selectByVisibleText(text);
        } catch (TimeoutException e){

        }
    }
    @Step("move to new window")
    public static void GetNewHandel(WebElement element, String text){
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals("New Window Title")) {
                wait.until((ExpectedConditions.visibilityOf(element)));
                element.sendKeys(text);
            }
        }
    }
    @Step("scroll-down in page")
    public static void ScrollDown(){
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    @Step("close window in test")
    public static void closeWindow(){
        String originalWindow=driver.getWindowHandle();
        for (String winHandle: driver.getWindowHandles()){
            System.out.println(winHandle);
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }
}