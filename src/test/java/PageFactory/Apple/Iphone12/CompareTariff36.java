package PageFactory.Apple.Iphone12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Integer.parseInt;

public class CompareTariff36 {
    WebDriver driver;
    public CompareTariff36(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //For 3GB
    @FindBy(xpath = "(//*[@class='text_new1 prices tariffUpfront '])[3]")
    WebElement upfront3;

    @FindBy(xpath = "(//*[@class='text_new1 prices tariffMonthly wasnowpink'])[3]")
    WebElement month3;

    public void tariff3GB(int upfront, int month) {
        String upfrontTariff20=upfront20.getText();
        String extractNumber=(String) upfrontTariff20.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        if(tariffExtraNumber==upfront){
            System.out.println("Upfront value for 3GB is matching");
        }
        else{
            System.out.println("Upfront value for 3GB is Not matching");
        }

        String monthTariff20=month3.getText();
        String extractNumber_month=(String) monthTariff20.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        if(monthTariffExtraNumber==month){
            System.out.println("month value for 3GB is matching");
        }
        else{
            System.out.println("month value for 3GB is Not matching");
        }

    }

    //For 6GB
    @FindBy(xpath = "(//*[@class='text_new1 prices tariffUpfront '])[4]")
    WebElement upfront6;

    @FindBy(xpath = "(//*[@class='text_new1 prices tariffMonthly wasnowpink'])[4]")
    WebElement month6;

    public void tariff6GB(int upfront, int month) {
        String upfrontTariff20=upfront6.getText();
        String extractNumber=(String) upfrontTariff20.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        if(tariffExtraNumber==upfront){
            System.out.println("Upfront value for 6GB is matching");
        }
        else{
            System.out.println("Upfront value for 6GB is Not matching");
        }

        String monthTariff20=month6.getText();
        String extractNumber_month=(String) monthTariff20.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        if(monthTariffExtraNumber==month){
            System.out.println("month value for 6GB is matching");
        }
        else{
            System.out.println("month value for 6GB is Not matching");
        }

    }
    //For 20GB
    @FindBy(xpath = "(//*[@class='text_new1 prices tariffUpfront '])[1]")
    WebElement upfront20;

    @FindBy(xpath = "(//*[@class='text_new1 prices tariffMonthly wasnowpink'])[1]")
    WebElement month20;

    public void tariff20GB(int upfront, int month) {
        String upfrontTariff20=upfront20.getText();
        String extractNumber=(String) upfrontTariff20.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        if(tariffExtraNumber==upfront){
            System.out.println("Upfront value for 20GB is matching");
        }
        else{
            System.out.println("Upfront value for 20GB is Not matching");
        }

        String monthTariff20=month20.getText();
        String extractNumber_month=(String) monthTariff20.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        if(monthTariffExtraNumber==month){
            System.out.println("month value for 20GB is matching");
        }
        else{
            System.out.println("month value for 20GB is Not matching");
        }

    }



    //For Unlimited
    @FindBy(xpath = "(//*[@class='text_new1 prices tariffUpfront '])[2]")
    WebElement upfrontUnlimited;

    @FindBy(xpath = "(//*[@class='text_new1 prices tariffMonthly wasnowpink'])[2]")
    WebElement monthUnlimited;

    public void tariffUnlimited(int upfront, int month) {
        String upfrontTariffUnlimited=upfrontUnlimited.getText();
        String extractNumber=(String) upfrontTariffUnlimited.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        if(tariffExtraNumber==upfront){
            System.out.println("Upfront value for unlimited is matching");
        }
        else{
            System.out.println("Upfront value for Unlimited is Not matching");
        }

        String monthTariffUnlimited=monthUnlimited.getText();
        String extractNumber_month=(String) monthTariffUnlimited.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        if(monthTariffExtraNumber==month){
            System.out.println("month value for Unlimited is matching");
        }
        else{
            System.out.println("month value for Unlimited is Not matching");
        }

    }

    //For 70GB
    @FindBy(xpath = "(//*[@class='text_new1 prices tariffUpfront '])[5]")
    WebElement upfront70;

    @FindBy(xpath = "(//*[@class='text_new1 prices tariffMonthly wasnowpink'])[5]")
    WebElement month70;
    public void tariff70GB(int upfront, int month) {
        String upfrontTariff70=upfront70.getText();
        String extractNumber=(String) upfrontTariff70.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        if(tariffExtraNumber==upfront){
            System.out.println("Upfront value for 70GB is matching");
        }
        else{
            System.out.println("Upfront value for 70GB is Not matching");
        }

        String monthTariff70=month70.getText();
        String extractNumber_month=(String) monthTariff70.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        if(monthTariffExtraNumber==month){
            System.out.println("month value for Unlimited is matching");
        }
        else{
            System.out.println("month value for Unlimited is Not matching");
        }
    }
}
