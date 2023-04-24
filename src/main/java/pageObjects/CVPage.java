package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class CVPage extends CommonOps {

    @FindBy(how = How.XPATH, using = "//*[@id='ContentPlaceHolder1_ucSearhRes_rptResults_resBox_0_UP1_0']/div/button[2]") // הגשת משרה
    public WebElement ClickDeveloper;
    @FindBy(how = How.XPATH, using = "//*[@id='cvupload']/div/button") // לסגור את חלון הקו"ח
    public WebElement closeWindowCV;
    @FindBy(how = How.XPATH, using = "//*[@id='errStripMail']") //   שליחת אימייל למטה
    public WebElement txtSendEmail;









}
