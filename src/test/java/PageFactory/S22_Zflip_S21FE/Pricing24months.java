package PageFactory.S22_Zflip_S21FE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Integer.parseInt;

public class Pricing24months {

    WebDriver driver;

    public Pricing24months(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[1]")
    WebElement upfront20gb;

    @FindBy(xpath = "(//*[@class= \"text_new1 prices tariffMonthly \"])[1]")
    WebElement monthly20gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[2]")
    WebElement upfrontunlimited;

    @FindBy(xpath = "(//*[@class= \"text_new1 prices tariffMonthly \"])[2]")
    WebElement monthlyunlimited;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[3]")
    WebElement upfront6gb;

    @FindBy(xpath = "(//*[@class= \"text_new1 prices tariffMonthly \"])[3]")
    WebElement monthly6gb;

    @FindBy(xpath = "(//*[@class=\"text_new1 prices tariffUpfront \"]/span)[4]")
    WebElement upfront70gb;

    @FindBy(xpath = "(//*[@class= \"text_new1 prices tariffMonthly \"])[4]")
    WebElement monthly70gb;

    public void tariff_24month_20gb(Integer pricingmatrixupfront, String pricingmatrixmonthly){
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
        String extractNumber_month=(String) tariffmonth20gb.subSequence(1,7);
        //int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+extractNumber_month);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmatrixmonthly);
        if(extractNumber_month.equalsIgnoreCase(pricingmatrixmonthly)){
            System.out.println("Business Shop Monthly Value "+extractNumber_month+" and Pricing Matrix monthly value"+pricingmatrixmonthly+" are matching");
        }
        else{
            System.out.println("month value for 20GB is Not matching");
        }
    }

    public void tariff_24month_unlimited(Integer pricingupfrontunlimited, String pricingmonthlyunlimited)
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
        String extractNumber_month=(String) tariffmonthunlimited.subSequence(1,7);
        //int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+extractNumber_month);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthlyunlimited);
        if(extractNumber_month.equalsIgnoreCase(pricingmonthlyunlimited)){
            System.out.println("Business Shop Monthly Value "+extractNumber_month+" and Pricing Matrix monthly value"+pricingmonthlyunlimited+" are matching");
        }
        else{
            System.out.println("month value for Unlimited is Not matching");
        }
    }


    public void tariff_24month_6gb(Integer pricingupfront6gb, String pricingmonthly6gb)
    {
        System.out.println("6GB tariff upfront and monthly values are: ");
        String tariffupfront6gb = upfront6gb.getText();
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

        String tariffmonth6gb=monthly6gb.getText();
        String extractNumber_month=(String) tariffmonth6gb.subSequence(1,7);
        //int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+extractNumber_month);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthly6gb);
        if(extractNumber_month.equalsIgnoreCase(pricingmonthly6gb)){
            System.out.println("Business Shop Monthly Value "+extractNumber_month+" and Pricing Matrix monthly value"+pricingmonthly6gb+" are matching");
        }
        else{
            System.out.println("month value for 6GB is Not matching");
        }
    }

    public void tariff_24month_70gb(Integer pricingupfront70gb, String pricingmonthly70gb)
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
        String extractNumber_month=(String) tariffmonth70gb.subSequence(1,7);
        //int monthTariffExtraNumber=parseInt(extractNumber_month);
        System.out.println("Business Page Price Monthly :"+extractNumber_month);
        System.out.println("Pricing Matrix Price Monthly: "+pricingmonthly70gb);
        if(extractNumber_month.equalsIgnoreCase(pricingmonthly70gb)){
            System.out.println("Business Shop Monthly Value "+extractNumber_month+" and Pricing Matrix monthly value"+pricingmonthly70gb+" are matching");
        }
        else{
            System.out.println("month value for 6GB is Not matching");
        }
    }
}
