package StepDefinition.Samsung;

import PageFactory.Apple.iPhoneSE3rdGeneration.PreprodHomePage;
import PageFactory.S22_Zflip_S21FE.MemoryVariant;
import PageFactory.S22_Zflip_S21FE.Pricing24months;
import PageFactory.S22_Zflip_S21FE.Pricing36months;
import PageFactory.S22_Zflip_S21FE.ProductsPage;
import PageFactory.Samsung_Aseries.BusinessMobilePhonePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class s22plus_Zflip_S21FE_steps {

    WebDriver driver;

    @Given("User is on the Business shop homepage")
    public void user_is_on_the_business_shop_homepage() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");

        try {
            driver.findElement(By.xpath("//*[@id=\"privacy_pref_optin\"]")).click();
        } catch (Exception e) {
            Reporter.log("pop-up is not displayed", true);
        }
    }

    PreprodHomePage homepage;
    @Then("hovers on phones and select device {string}")
    public void hovers_on_phones_and_select_device(String Device_Name) {
        homepage = new PreprodHomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.hoverAndClick();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@class='searchInput ui-autocomplete-input']")).sendKeys(Device_Name);
        driver.findElement(By.xpath("//*[@class='searchImage']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        try{
            driver.findElement(By.xpath("//*[text()='"+Device_Name+"']")).click();
        }
        catch (Exception e) {
            Reporter.log("Device is not available in Online shop", true);
            Assert.fail();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    @Then("User is navigated to the mobile description page and clicks on view all tariffs")
    public void user_is_navigated_to_the_mobile_description_page_and_clicks_on_view_all_tariffs() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        try{
            driver.findElement(By.xpath("//a[text()='View all tariffs']")).click();
        }
        catch (Exception e)
        {
            Reporter.log("The device is not available in this memory variant",true);
            Assert.fail();
        }
    }
    @Then("navigated to Tariffs and Extras page and verifies the 36month tariffs")
    public void navigated_to_tariffs_and_extras_page_and_verifies_the_36month_tariffs() throws InterruptedException {
        //System.out.println("===36month===");
        // System.out.println(driver.findElement(By.xpath("//*[@id=\"output\"]")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)", "");
        Thread.sleep(5000);
    }

    Pricing36months PM;
    @Then("compares the 36month- 20GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_36month_20gb_tariff_values_with_pricing_matrix_values(Integer pricingmatrixupfront, String pricingmatrixmonthly)  {
        PM= new Pricing36months(driver);
        PM.tariff_36month_20gb(pricingmatrixupfront,pricingmatrixmonthly);
    }
    @Then("compares the 36month- Unlimited tariff values with pricing matrix values {int} {string}")
    public void compares_the_36month_unlimited_tariff_values_with_pricing_matrix_values(Integer pricingupfrontunlimited, String pricingmonthlyunlimited) {
        PM.tariff_36month_unlimited(pricingupfrontunlimited,pricingmonthlyunlimited);
    }
    @Then("compares the 36month- 6GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_36month_6gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront6gb, String pricingmonthly6gb) {
        PM.tariff_36month_6gb(pricingupfront6gb, pricingmonthly6gb);
    }
    @Then("compares the 36month- 70GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_36month_70gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront70gb, String pricingmonthly70gb) {
        PM.tariff_36month_70gb(pricingupfront70gb, pricingmonthly70gb);
    }
    @Then("clicks on 24months button")
    public void clicks_on_24months_button() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//*[@id=\"24mnt\"]")).click();
        Thread.sleep(5000);
    }

    Pricing24months PM24;
    @Then("Compares the 24month- 20GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_20gb_tariff_values_with_pricing_matrix_values(Integer pricingmatrixupfront, String pricingmatrixmonthly) {
        PM24= new Pricing24months(driver);
        PM24.tariff_24month_20gb(pricingmatrixupfront,pricingmatrixmonthly);

    }
    @Then("Compares the 24month- Unlimited tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_unlimited_tariff_values_with_pricing_matrix_values(Integer pricingupfrontunlimited, String pricingmonthlyunlimited) {
        PM24.tariff_24month_unlimited(pricingupfrontunlimited,pricingmonthlyunlimited);
    }
    @Then("Compares the 24month- 6GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_6gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront6gb, String pricingmonthly6gb) {
       PM24.tariff_24month_6gb(pricingupfront6gb, pricingmonthly6gb);
    }
    @Then("Compares the 24month- 70GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_70gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront70gb, String pricingmonthly70gb) {
        PM24.tariff_24month_70gb(pricingupfront70gb, pricingmonthly70gb);
    }

}
