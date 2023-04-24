package extansions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class Verifications extends CommonOps {

    @Step("verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected){
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(),expected);
    }
    @Step("number Of Elements")
    public static void numberOfElements(List<WebElement> elements, int expected){
        wait.until(ExpectedConditions.visibilityOf(elements.get(elements.size() -1)));
        assertEquals(elements.size(), expected);
    }
    @Step("visibility Of Elements (Soft-Assertions)")
    public static void visibilityOfElements(List<WebElement> elements){
        for (WebElement elem : elements) {
            softAssert.assertTrue(elem.isDisplayed(),"i'm sorry" + elem.getText() + "not displayed");
        }
        softAssert.assertAll("Some elements is not displayed ");
    }

    @Step("Verify Element Visually")
    public static void visualElement(String expectedIMageName){
        try {
            Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
            screen.find(getData("ImageRepo") + expectedIMageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File" + findFailed);
            fail("Error Comparing Image File" + findFailed);
        }
    }
}
