package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.CommonOps;

public class SearchJobs extends CommonOps {


    @FindBy(how = How.CSS, using = "button[class='btn btn-default dropdown-toggle radius']") // פעולת קליק על חיפוש המשרות ברובליקה
    public WebElement clickOnDomains;
    @FindBy(how = How.ID, using = "mainP646") // פעולת קליק על qa
    public WebElement clickOnQA;
    @FindBy(how = How.XPATH, using = "//*[@id='mainP646']/div/div[5]/label") // פעולת קליק על בדיקות אוטומציה
    public WebElement clickOnAutomation;
    @FindBy(how = How.ID, using = "searchbtn") // פעולת קליק חפש
    public WebElement clickOnSearch;
    @FindBy(how = How.XPATH, using = "//div[@class='col-md-12']/h1") // וידוא כותרת
    public WebElement VerifyTitle;
}
