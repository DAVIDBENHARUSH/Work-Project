package utilities;

import org.openqa.selenium.support.PageFactory;

public class MangePages extends Base{

    public static void initAllGobs(){
        mainPage = PageFactory.initElements(driver,pageObjects.MainPage.class);
        jobPage = PageFactory.initElements(driver,pageObjects.JobPage.class);
        cvPage = PageFactory.initElements(driver,pageObjects.CVPage.class);
        searchJobs = PageFactory.initElements(driver,pageObjects.SearchJobs.class);
        linkdeinJobNet = PageFactory.initElements(driver,pageObjects.LinkdeinJobNet.class);
    }
}
