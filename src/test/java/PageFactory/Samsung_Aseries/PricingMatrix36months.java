package PageFactory.Samsung_Aseries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Integer.parseInt;

public class PricingMatrix36months {

    WebDriver driver;

    public PricingMatrix36months(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[1]")
    WebElement upfront20gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffMonthly \"]/span)[1]")
    WebElement monthly20gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[2]")
    WebElement upfrontunlimited;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffMonthly \"]/span)[2]")
    WebElement monthlyunlimited;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[3]")
    WebElement upfront3gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffMonthly \"]/span)[3]")
    WebElement monthly3gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[4]")
    WebElement upfront6gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffMonthly \"]/span)[4]")
    WebElement monthly6gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[5]")
    WebElement upfront70gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffMonthly \"]/span)[5]")
    WebElement monthly70gb;

    public void tariff_36month_20gb(Integer pricingmatrixupfront, Integer pricingmatrixmonthly) throws InterruptedException {
        System.out.println("20GB upfront and monthly values are: ");
        String tariffupfront20gb = upfront20gb.getText();
        String extractNumber=(String) tariffupfront20gb.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        System.out.println("Business Page Price upfront is :"+tariffExtraNumber);
        System.out.println("Pricing Matrix Price upfront: "+pricingmatrixupfront);
        if(tariffExtraNumber==pricingmatrixupfront){
            System.out.println("Business Shop Upfront value "+tariffExtraNumber+" and pricing matrix value "+pricingmatrixupfront+" are matching");
        }
        else{
            System.out.println("Upfront value for 20GB is Not matching");
        }

        String tariffmonth20gb=monthly20gb.getText();
        String extractNumber_month=(String) tariffmonth20gb.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+monthTariffExtraNumber);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmatrixmonthly);
        if(monthTariffExtraNumber==pricingmatrixmonthly){
            System.out.println("Business Shop Monthly Value "+monthTariffExtraNumber+" and Pricing Matrix monthly value"+pricingmatrixmonthly+" are matching");
        }
        else{
            System.out.println("month value for 20GB is Not matching");
        }
    }

    public void tariff_36month_unlimited(Integer pricingupfrontunlimited, Integer pricingmonthlyunlimited)
    {
        System.out.println("Unlimited tariff upfront and monthly values are: ");
        String tariffupfrontunlimited = upfrontunlimited.getText();
        String extractNumber=(String) tariffupfrontunlimited.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        System.out.println("Business Page Price upfront is :"+tariffExtraNumber);
        System.out.println("Pricing Matrix Price upfront: "+pricingupfrontunlimited);
        if(tariffExtraNumber==pricingupfrontunlimited){
            System.out.println("Business Shop Upfront value "+tariffExtraNumber+" and pricing matrix value "+pricingupfrontunlimited+" are matching");
        }
        else{
            System.out.println("Upfront value for Unlimited is Not matching");
        }

        String tariffmonthunlimited=monthlyunlimited.getText();
        String extractNumber_month=(String) tariffmonthunlimited.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+monthTariffExtraNumber);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthlyunlimited);
        if(monthTariffExtraNumber==pricingmonthlyunlimited){
            System.out.println("Business Shop Monthly Value "+monthTariffExtraNumber+" and Pricing Matrix monthly value"+pricingmonthlyunlimited+" are matching");
        }
        else{
            System.out.println("month value for Unlimited is Not matching");
        }
    }

    public void tariff_36month_3gb(Integer pricingupfront3gb, Integer pricingmonthly3gb)
    {
        System.out.println("3GB tariff upfront and monthly values are: ");
        String tariffupfront3gb = upfront3gb.getText();
        String extractNumber=(String) tariffupfront3gb.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        System.out.println("Business Page Price upfront is :"+tariffExtraNumber);
        System.out.println("Pricing Matrix Price upfront: "+pricingupfront3gb);
        if(tariffExtraNumber==pricingupfront3gb){
            System.out.println("Business Shop Upfront value "+tariffExtraNumber+" and pricing matrix value "+pricingupfront3gb+" are matching");
        }
        else{
            System.out.println("Upfront value for 3GB is Not matching");
        }

        String tariffmonth3gb=monthly3gb.getText();
        String extractNumber_month=(String) tariffmonth3gb.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+monthTariffExtraNumber);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthly3gb);
        if(monthTariffExtraNumber==pricingmonthly3gb){
            System.out.println("Business Shop Monthly Value "+monthTariffExtraNumber+" and Pricing Matrix monthly value"+pricingmonthly3gb+" are matching");
        }
        else{
            System.out.println("month value for 3GB is Not matching");
        }
    }

    public void tariff_36month_6gb(Integer pricingupfront6gb, Integer pricingmonthly6gb)
    {
        System.out.println("6GB tariff upfront and monthly values are: ");
        String tariffupfront6gb = upfront3gb.getText();
        String extractNumber=(String) tariffupfront6gb.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        System.out.println("Business Page Price upfront is :"+tariffExtraNumber);
        System.out.println("Pricing Matrix Price upfront: "+pricingupfront6gb);
        if(tariffExtraNumber==pricingupfront6gb){
            System.out.println("Business Shop Upfront value "+tariffExtraNumber+" and pricing matrix value "+pricingupfront6gb+" are matching");
        }
        else{
            System.out.println("Upfront value for 6GB is Not matching");
        }

        String tariffmonth6gb=monthly3gb.getText();
        String extractNumber_month=(String) tariffmonth6gb.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+monthTariffExtraNumber);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthly6gb);
        if(monthTariffExtraNumber==pricingmonthly6gb){
            System.out.println("Business Shop Monthly Value "+monthTariffExtraNumber+" and Pricing Matrix monthly value"+pricingmonthly6gb+" are matching");
        }
        else{
            System.out.println("month value for 6GB is Not matching");
        }
    }

    public void tariff_36month_70gb(Integer pricingupfront70gb, Integer pricingmonthly70gb)
    {
        System.out.println("70GB tariff upfront and monthly values are: ");
        String tariffupfront70gb = upfront70gb.getText();
        String extractNumber=(String) tariffupfront70gb.subSequence(1,3);
        int tariffExtraNumber=parseInt(extractNumber);
        System.out.println("Business Page Price upfront is :"+tariffExtraNumber);
        System.out.println("Pricing Matrix Price upfront: "+pricingupfront70gb);
        if(tariffExtraNumber==pricingupfront70gb){
            System.out.println("Business Shop Upfront value "+tariffExtraNumber+" and pricing matrix value "+pricingupfront70gb+" are matching");
        }
        else{
            System.out.println("Upfront value for 6GB is Not matching");
        }

        String tariffmonth70gb=monthly70gb.getText();
        String extractNumber_month=(String) tariffmonth70gb.subSequence(1,3);
        int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+monthTariffExtraNumber);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthly70gb);
        if(monthTariffExtraNumber==pricingmonthly70gb){
            System.out.println("Business Shop Monthly Value "+monthTariffExtraNumber+" and Pricing Matrix monthly value"+pricingmonthly70gb+" are matching");
        }
        else{
            System.out.println("month value for 6GB is Not matching");
        }
    }

}






