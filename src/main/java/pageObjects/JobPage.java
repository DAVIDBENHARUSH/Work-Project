package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.CommonOps;

import java.util.List;

public class JobPage extends CommonOps {
    @FindBy(how = How.XPATH, using = "//*[@id='addinput']") //כפתור המשרות
    public WebElement JobSearch;
    @FindBy(how = How.XPATH, using = "//*[@id='txtFreeSrch']") //חיפוש משרות
    public WebElement txtSearch;
    @FindBy(how = How.XPATH, using = "//*[@id='hiddenform']/a") //כפתור חיפוש
    public WebElement BtnGoSearch;
    @FindBy(how = How.XPATH, using = "//div[@class='col-md-12']/h1") // אימות הכותרת במשרות פתוח אוטומטיות
    public WebElement VerifyOpenJobs;
    @FindBy(how = How.XPATH, using = "//div[@class='hidecheckbox']/div") // לקיחת משרה מלאה
    public WebElement SelectFromList;


}