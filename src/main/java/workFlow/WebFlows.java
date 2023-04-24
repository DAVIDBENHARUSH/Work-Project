package workFlow;

import extansions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class WebFlows extends CommonOps {
    @Step("Business Flow: Login")
    public static void Main(String email, String pass){
        UIActions.click(mainPage.Btn_LoginMyProfile);
        UIActions.updateText(mainPage.txt_Email,email);
        UIActions.updateText(mainPage.txt_Pass,pass);
        UIActions.click(mainPage.btn_Login);

    }
    @Step("Business Flow: Search Automation Job")
    public static void JobAuto(String Search){
        UIActions.click(jobPage.JobSearch);
        UIActions.updateText(jobPage.txtSearch, Search);
        UIActions.click(jobPage.BtnGoSearch);
        UIActions.click(jobPage.SelectFromList);
    }
    @Step("Business Flow: Click on Developer and close")
    public static void closeWindow(){
        UIActions.click(cvPage.ClickDeveloper);
        UIActions.closeWindow();
        UIActions.click(cvPage.closeWindowCV);
        UIActions.ScrollDown();
    }
    @Step("Business Flow: Search in the page New Automation Jobs")
    public static void SearchJobs(){
        UIActions.click(searchJobs.clickOnDomains);
        UIActions.click(searchJobs.clickOnQA);
        UIActions.click(searchJobs.clickOnAutomation);
        UIActions.click(searchJobs.clickOnSearch);
        UIActions.ScrollDown();
    }
    @Step("Click and Open Linkdein Page")
    public static void Linkdein(){
        UIActions.click(linkdeinJobNet.CloseTab);
        UIActions.click(linkdeinJobNet.ClickOnLinkdein);


    }





}
