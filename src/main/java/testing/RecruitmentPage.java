package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class RecruitmentPage extends PageBase{
    public RecruitmentPage(WebDriver driver) {
        super(driver);
    }
     By jobTitle = By.xpath("(//*[@class=\"oxd-select-text-input\"])[1]");
     By vacancy = By.xpath("(//*[@class=\"oxd-select-text-input\"])[2]");
     By hiringManager = By.xpath("(//*[@class=\"oxd-select-text-input\"])[3]");
     By status = By.xpath("(//*[@class=\"oxd-select-text-input\"])[4]");
     By candidateName = By.xpath("//*[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]");
     By keywords = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[2]");
     By dateOfApplicationFrom = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[3]");
     By dateOfApplicationTo = By.xpath("(//*[@class=\"oxd-input oxd-input--active\"])[4]");
     By methodOfApplication = By.xpath("(//*[@class=\"oxd-select-text-input\"])[5]");
     By resetButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]");
     By searchButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
     By addButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

     public void fillJobTitle(String jobTitle){
         sendKeys(this.jobTitle,jobTitle);
     }
    public void fillVacancy(String vacancy){
        sendKeys(this.vacancy,vacancy);
    }
    public void fillHiringManager(String hiringManager){
        sendKeys(this.hiringManager,hiringManager);
    }
    public void fillStatus(String status){
        sendKeys(this.status,status);
    }
    public void fillCandidateName(String candidateName){
        sendKeys(this.candidateName,candidateName);
    }
    public void fillKeyWords(String keywords){
        sendKeys(this.keywords,keywords);
    }
    public void fillDateOfApplication(String dateOfApplicationFrom){
        selectfromDropDownList(this.dateOfApplicationFrom,dateOfApplicationFrom);
    }
   public void fillDateOfApplicationTo(String dateOfApplicationTo){
       selectfromDropDownList(this.dateOfApplicationTo,dateOfApplicationTo);
   }
   public void fillMethodOfApplication(String methodOfApplication){
         selectfromDropDownList(this.methodOfApplication,methodOfApplication);
   }
  public void clickResetButton(String resetButton){
         clickOnElement(this.resetButton);
  }
  public void clickSearchButton(String  searchButton ){
         clickOnElement(this. searchButton );
     }
     public void clickAddButton(String addButton){
         clickOnElement(this.addButton);
     }






}
