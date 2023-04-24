package sanity;

import com.google.common.util.concurrent.Uninterruptibles;
import extansions.Verifications;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workFlow.WebFlows;
import java.util.concurrent.TimeUnit;




@Listeners(utilities.Listeners.class)
public class AllGobsTests extends CommonOps {

    @Test(description = "Test01 verify-header")
    @Description("This test login and verifies the main header")
    public void Test01_verifyHeader() {
        // פעולת הלוגין נמצאת ב CommonOps
        Verifications.verifyTextInElement(mainPage.Verify_title, "לוח דרושים: חיפוש עבודה בחינם");
    }

    @Test(description = "Test02 verify-jobs")
    @Description("This test search automations jobs and verifies the title")
    public void Test02_JobAutomation() {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        WebFlows.JobAuto("Automation");
        Verifications.verifyTextInElement(jobPage.VerifyOpenJobs, "משרות Automation פנויות");
    }

    @Test(description = "Test03 close and scroll ")
    @Description("This test search Automations jobs in page ")
    public void Test03_JobSearchCV() {
        WebFlows.closeWindow();
        WebFlows.SearchJobs();
        Verifications.verifyTextInElement(searchJobs.VerifyTitle, " דרושים בתחום בדיקות אוטומטיות");
    }

    @Test(description = "Test04 open linkdain")
    @Description("This test Scroll down in the  page then click on linkdain and open a new window")
    public void Test04_LinkdeinAndFollow() {
        WebFlows.Linkdein();
    }

    @Test(description = "Test05 Verify Avatar Icon")
    @Description("This test is Verify the Image in linkdein (sign-in) JobNet")
    public void Test05_VerifyAvatarIcon() {
        Verifications.visualElement("NewAvatar1");
    }
}
