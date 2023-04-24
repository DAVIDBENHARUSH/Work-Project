package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
    @FindBy(how = How.XPATH, using = "//*[@id='loginmyprofile']") //כניסה לאיזור האישי
    public WebElement Btn_LoginMyProfile;
    @FindBy(how = How.XPATH, using = "//*[@id='emailBlock']") //הזנת אימיל
    public WebElement txt_Email;
    @FindBy(how = How.XPATH, using = "//*[@id='passwordBlock']") //הזנת סיסמא
    public WebElement txt_Pass;
    @FindBy(how = How.XPATH, using = "//*[@id='login']") //קליק על כניסה
    public WebElement btn_Login;
    @FindBy(how = How.XPATH, using = "//div[@class='container']/h1") //וידוא הכותרת לאחר ביצוע כניסה
    public WebElement Verify_title;
}
