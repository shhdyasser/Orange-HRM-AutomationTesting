package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testing.DashboardPage;
import testing.LoginPage;
import testing.RecruitmentPage;

public class LoginTest extends TestBase{

    LoginPage loginpage;
    DashboardPage dashboardPage;
    private RecruitmentPage recruitmentPage;


    @BeforeMethod
    public void init(){
        loginpage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        recruitmentPage = new RecruitmentPage(driver);
    }


    @Test
    public void LoginWithValidUsernameAndValidPassword() throws InterruptedException {
        System.out.println(driver);
        loginpage.fillUserName("Admin");
        loginpage.fillPassword("admin123");
        loginpage.clickOnLoginButton();
        Thread.sleep(10000);
        Assert.assertEquals(dashboardPage.ActualResultAssert(),dashboardPage.dashboardText);
        dashboardPage.ClickRecruitmentButton();
        Thread.sleep(10000);
        recruitmentPage.fillJobTitle("Automation Tester");
        recruitmentPage.fillVacancy("Junior Account Assistant");
        recruitmentPage.fillHiringManager("Mohamed Alanzi");
        recruitmentPage.fillStatus("Rejected");

    }

}
