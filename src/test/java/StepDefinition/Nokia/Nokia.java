package StepDefinition.Nokia;

import PageFactory.Nokia.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Nokia {
    WebDriver driver;
    @Given("user is on online business shop home page")
    public void user_is_on_online_business_shop_home_page() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/Browser_Chrome/chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver =new ChromeDriver(opt);
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://csupreprod-businessshop.cs88.force.com/");
        //driver.findElement(By.xpath("//*[@id=\"privacy_pref_optin\"]")).click();
    }

    PreprodHomePage homepage;
    @When("user hover on shop and clicks on All phones icon")
    public void user_hover_on_shop_and_clicks_on_all_phones_icon() {
        homepage = new PreprodHomePage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        homepage.hoverAndClick();
    }

    FilterFunctionCheckPage Filter;
    ChooseOption option;
    @Then("user select Nokia brand under Filter section")
    public void userSelectNokiaBrandUnderFilterSection() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //SSThread.sleep(30);
        Filter=new FilterFunctionCheckPage(driver);
        Filter.clickFilter();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)", "");
        option=new ChooseOption(driver);
        option.clickPlusForBrand();
        option.selectAnyBrand();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,190)", "");
        option.clickDone();
    }

    MobileProduct product;
    @Then("user is navigated to Business Mobile Phones and user select the {int} {string}")
    public void user_is_navigated_to_business_mobile_phones_and_user_select_the(int serial_number, String Mobile_name) {
        product=new MobileProduct(driver);
        if(serial_number==1) {
            System.out.println("For FirstProduct");
            product.FirstPhone();
        }
        if(serial_number==2) {
            System.out.println(" For second product");
            product.SecondPhone();
        }

        if(serial_number==3){
            System.out.println("For Third Product");
            product.ThirdPhone();
        }


    }

    MobileDescriptionPage viewAllTariff;
    @Then("user is navigated to phone description page and click on view all tariffs")
    public void user_is_navigated_to_phone_description_page_and_click_on_view_all_tariffs() throws InterruptedException {
        //driver.navigate().refresh();
        viewAllTariff=new MobileDescriptionPage(driver);
        Thread.sleep(2000);
        viewAllTariff.clickOnViewAllTariffs();
    }

    @Then("user is navigated to tariffs and extras page for verifies the 36 month tariffs")
    public void user_is_navigated_to_tariffs_and_extras_page_for_verifies_the_36month_tariffs() throws InterruptedException {
        System.out.println("===36month===");
        // System.out.println(driver.findElement(By.xpath("//*[@id=\"output\"]")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,420)", "");
        Thread.sleep(5000);
    }


    CompareTariff36 tariff36;

    @Then("compare the 36month- 20GB tariff values with pricing matrix {int} {int}")
    public void compare_the_36month_20gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        tariff36=new CompareTariff36(driver);
        System.out.println("-------For 20GB Tariff--------");
        tariff36.tariff20GB(upfront,month);
    }
    @Then("compare the 36month- 3GB tariff values with pricing matrix {int} {int}")
    public void compare_the_36month_3gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 3GB Tariff--------");
        tariff36.tariff3GB(upfront,month);
    }

    @Then("compare the 36month- 6GB tariff values with pricing matrix {int} {int}")
    public void compare_the_36month_6gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 6GB Tariff--------");
        tariff36.tariff6GB(upfront,month);
    }



    @Then("compare the 36month- 70GB tariff values with pricing matrix {int} {int}")
    public void compare_the_36month_70gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 70GB Tariff--------");
        tariff36.tariff70GB(upfront,month);
    }

    @Then("compare the 36month- Unlimited tariff values with pricing matrix {int} {int}")
    public void compare_the_36month_unlimited_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For Unlimited Tariff--------");
        tariff36.tariffUnlimited(upfront,month);
    }

    @Then("click on 24 months tariff button")
    public void click_on_24months_tariff_button() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("===24month===");
        WebElement month24=driver.findElement(By.xpath("//button[text()=\"24 months\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", month24);
        Thread.sleep(10000);
    }
    CompareTariff24 tariff24;
    @Then("compare the 24month- 20GB tariff values with pricing matrix {int} {int}")
    public void compare_the_24month_20gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        tariff24=new CompareTariff24(driver);
        System.out.println("-------For 20GB Tariff--------");
        tariff24.tariff20GB(upfront,month);
    }
    @Then("compare the 24month- 3GB tariff values with pricing matrix {int} {int}")
    public void compare_the_24month_3gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 20GB Tariff--------");
        tariff24.tariff3GB(upfront,month);
    }

    @Then("compare the 24month- 6GB tariff values with pricing matrix {int} {int}")
    public void compare_the_24month_6gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 6GB Tariff--------");
        tariff24.tariff6GB(upfront,month);
    }



    @Then("compare the 24month- 70GB tariff values with pricing matrix {int} {int}")
    public void compare_the_24month_70gb_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For 70GB Tariff--------");
        tariff24.tariff70GB(upfront,month);
    }

    @Then("compare the 24month- Unlimited tariff values with pricing matrix {int} {int}")
    public void compare_the_24month_unlimited_tariff_values_with_pricing_matrix_values(int upfront, int month) {
        System.out.println("-------For unlimited Tariff--------");
        tariff36.tariffUnlimited(upfront,month);
    }



}
