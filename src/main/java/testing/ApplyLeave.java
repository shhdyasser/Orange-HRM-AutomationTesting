package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApplyLeave extends PageBase{
    public ApplyLeave(WebDriver driver) {
        super(driver);
    }
    By leaveType = By.xpath("(//*[@class=\"oxd-select-text-input\"][1])");
    By fromDate = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"][2])");
    By toDate = By.xpath("(//input[@class=\"oxd-input oxd-input--active\"][3])");
    By applyButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");

    public void fillLeaveType(String value){
        selectfromDropDownList(this.leaveType,value);
    }
    public void fillFromDate(String fromDate){
        sendKeys(this.fromDate,fromDate);
    }
    public void fillToDate(String toDate){
        sendKeys(this.toDate,toDate);
    }
    public void clickOnApplyButton(){
        clickOnElement(applyButton);
    }

}

