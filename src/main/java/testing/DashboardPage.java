package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends PageBase{

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";  //expected Result

    public String dashboardText = "Dashboard";

    By RecruitmentButton = By.xpath("(//a[@class=\"oxd-main-menu-item\"])[5]");
    By actualResult =By.xpath("//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");

    public String ActualResultAssert(){
        return driver.findElement(actualResult).getText();
    }
    public void ClickRecruitmentButton(){
        clickOnElement(RecruitmentButton);
    }
}
