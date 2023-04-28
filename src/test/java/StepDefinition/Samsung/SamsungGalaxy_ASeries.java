package StepDefinition.Samsung;

import PageFactory.Apple.iPhoneSE3rdGeneration.PreprodHomePage;
import PageFactory.Samsung_Aseries.PricingMatrix24Months;
import PageFactory.Samsung_Aseries.PricingMatrix36months;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;

public class SamsungGalaxy_ASeries {

    WebDriver driver;

    @Given("User is on the Business homepage")
    public void user_is_on_the_business_homepage() {
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
    @Then("hovers on phones and select device with name {string}")
    public void hovers_on_phones_and_select_device_with_name(String Device_Name) {
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


    @Then("User is navigated to the phone description page and clicks on view all tariffs")
    public void user_is_navigated_to_the_phone_description_page_and_selects_the_memory_variant() {
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
    @Then("navigated to tariffs and Extras page and verifies the 36month tariffs")
    public void navigated_to_tariffs_and_extras_page_and_verifies_the_36month_tariffs() throws InterruptedException {
        //System.out.println("===36month===");
        // System.out.println(driver.findElement(By.xpath("//*[@id=\"output\"]")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)", "");
        Thread.sleep(5000);
    }

    PricingMatrix36months PM36;
    @Then("compares the 36month- 20GB tariff with pricing matrix values {int} {int}")
    public void compares_the_36month_20gb_tariff_with_pricing_matrix_values(Integer pricingmatrixupfront, Integer pricingmatrixmonthly) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        PM36= new PricingMatrix36months(driver);
        PM36.tariff_36month_20gb(pricingmatrixupfront,pricingmatrixmonthly);
    }


    @Then("compares the 36month- Unlimited tariff with pricing matrix values {int} {int}")
    public void compares_the_36month_unlimited_tariff_with_pricing_matrix_values(Integer pricingupfrontunlimited, Integer pricingmonthlyunlimited) {
        PM36.tariff_36month_unlimited(pricingupfrontunlimited,pricingmonthlyunlimited);
    }
    @Then("compares the 36month- 3GB tariff with pricing matrix values {int} {int}")
    public void compares_the_36month_3gb_tariff_with_pricing_matrix_values(Integer pricingupfront3gb, Integer pricingmonthly3gb) {
        PM36.tariff_36month_3gb(pricingupfront3gb,pricingmonthly3gb);
    }
    @Then("compares the 36month- 6GB tariff with pricing matrix values {int} {int}")
    public void compares_the_36month_6gb_tariff_with_pricing_matrix_values(Integer pricingupfront6gb, Integer pricingmonthly6gb) {
        PM36.tariff_36month_6gb(pricingupfront6gb,pricingmonthly6gb);
    }
    @Then("compares the 36month- 70GB tariff with pricing matrix values {int} {int}")
    public void compares_the_36month_70gb_tariff_with_pricing_matrix_values(Integer pricingupfront70gb, Integer pricingmonthly70gb) {
        PM36.tariff_36month_70gb(pricingupfront70gb,pricingmonthly70gb);
    }
    @Then("click on 24months button")
    public void click_on_24months_button() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("===24month===");
        WebElement month24=driver.findElement(By.xpath("//button[text()=\"24 months\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", month24);
        Thread.sleep(10000);
    }

    PricingMatrix24Months PM24;
    @Then("compares the 24month- 20GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_20gb_tariff_values_with_pricing_matrix_values(Integer pricingmatrixupfront, String pricingmatrixmonthly) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        PM24= new PricingMatrix24Months(driver);
        PM24.tariff_24month_20gb(pricingmatrixupfront,pricingmatrixmonthly);
    }
    @Then("compares the 24month- Unlimited tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_unlimited_tariff_values_with_pricing_matrix_values(Integer pricingupfrontunlimited, String pricingmonthlyunlimited) {
        PM24.tariff_24month_unlimited(pricingupfrontunlimited,pricingmonthlyunlimited);
    }
    @Then("compares the 24month- 3GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_3gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront3gb, String pricingmonthly3gb) {
        PM24.tariff_24month_3gb(pricingupfront3gb,pricingmonthly3gb);
    }
    @Then("compares the 24month- 6GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_6gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront6gb, String pricingmonthly6gb) {
        PM24.tariff_24month_6gb(pricingupfront6gb,pricingmonthly6gb);
    }
    @Then("compares the 24month- 70GB tariff values with pricing matrix values {int} {string}")
    public void compares_the_24month_70gb_tariff_values_with_pricing_matrix_values(Integer pricingupfront70gb, String pricingmonthly70gb) {
        PM24.tariff_24month_70gb(pricingupfront70gb,pricingmonthly70gb);
    }

}
