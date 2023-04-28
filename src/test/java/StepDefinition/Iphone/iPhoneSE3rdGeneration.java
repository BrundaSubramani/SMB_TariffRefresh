package StepDefinition.Iphone;

import PageFactory.Apple.iPhoneSE3rdGeneration.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iPhoneSE3rdGeneration {
    WebDriver driver;
    @Given("^Customer did launch the businessshop$")
    public void Customer_did_launch_the_businessshop()
    {
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
    @Then("^navigates to phone section and selects device with name \"([^\"]*)\"$")
    public void navigates_to_phone_section_and_selects_device_with_name(String Device_Name)
    {
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

    @Then("^Customer selects the \"([^\"]*)\" variant and clicks on view tariff button$")
    public void Customer_selects_the_variant_and_clicks_on_view_tariff_button(String memory) throws InterruptedException {
        try
        {
            driver.findElement(By.xpath("//*[@class='variantSelectionOptionDiv']/UL[2]/li/div[2]")).click();
        }
        catch(Exception e)
        {
            Reporter.log("Only one memory variant is available",true);
        }
        try {
            driver.findElement(By.xpath("//*[text()='" + memory + "']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        catch(Exception e)
        {
            Reporter.log("The device is not available in this memory variant",true);
            Assert.fail();
        }
        //*[@class='variantSelectionOptionDiv']/ul[2]/li/div[text()="128GB"]
        driver.findElement(By.xpath("//a[text()='View all tariffs']")).click();
        Thread.sleep(10000);
    }

    @Then("user is navigated to tariffs and extras page for verifies the 36month tariffs")
    public void user_is_navigated_to_tariffs_and_extras_page_for_verifies_the_36month_tariffs() throws InterruptedException {
        System.out.println("===36month===");
        // System.out.println(driver.findElement(By.xpath("//*[@id=\"output\"]")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)", "");
        Thread.sleep(5000);
    }


    CompareTariff36 tariff36;
    @Then("compare the 36month- 3GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_36month_3gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        tariff36=new CompareTariff36(driver);
        System.out.println("-------For 3GB Tariff--------");
        tariff36.tariff3GB(upfront,month);
    }

    @Then("compare the 36month- 6GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_36month_6gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 6GB Tariff--------");
        tariff36.tariff6GB(upfront,month);
    }

    @Then("compare the 36month- 20GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_36month_20gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 20GB Tariff--------");
        tariff36.tariff20GB(upfront,month);
    }

    @Then("compare the 36month- 70GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_36month_70gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 70GB Tariff--------");
        tariff36.tariff70GB(upfront,month);
    }

    @Then("compare the 36month- Unlimited tariff values with pricing matrix values {int} {int}")
    public void compare_the_36month_unlimited_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For Unlimited Tariff--------");
        tariff36.tariffUnlimited(upfront,month);
    }

    @Then("click on 24months tariff button")
    public void click_on_24months_tariff_button() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("===24month===");
        WebElement month24=driver.findElement(By.xpath("//button[text()=\"24 months\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", month24);
        Thread.sleep(10000);
    }
    CompareTariff24 tariff24;
    @Then("compare the 24month- 3GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_24month_3gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        tariff24=new CompareTariff24(driver);
        System.out.println("-------For 20GB Tariff--------");
        tariff24.tariff3GB(upfront,month);
    }

    @Then("compare the 24month- 6GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_24month_6gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 6GB Tariff--------");
        tariff24.tariff6GB(upfront,month);
    }

    @Then("compare the 24month- 20GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_24month_20gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 20GB Tariff--------");
        tariff24.tariff20GB(upfront,month);
    }

    @Then("compare the 24month- 70GB tariff values with pricing matrix values {int} {int}")
    public void compare_the_24month_70gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 70GB Tariff--------");
        tariff24.tariff70GB(upfront,month);
    }

    @Then("compare the 24month- Unlimited tariff values with pricing matrix values {int} {int}")
    public void compare_the_24month_unlimited_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For unlimited Tariff--------");
        tariff36.tariffUnlimited(upfront,month);
    }

}
