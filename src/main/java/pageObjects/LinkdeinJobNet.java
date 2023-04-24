package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class LinkdeinJobNet extends CommonOps {

    @FindBy(how = How.XPATH, using = "//*[@id=\"modalAggentReg\"]/div/button/img") // וידוא כותרת לינקדין
    public WebElement CloseTab;
    @FindBy(how = How.XPATH, using = "/html/body/div[8]/footer/div/div/div[4]/div/a[2]") // פעולת קליק על תכונה
    public WebElement ClickOnLinkdein;
    @FindBy(how = How.XPATH, using = "//*[@id='organization_guest_contextual-sign-in-modal-header']") // וידוא כותרת לינקדין
    public WebElement VerifyJobNet;

}
