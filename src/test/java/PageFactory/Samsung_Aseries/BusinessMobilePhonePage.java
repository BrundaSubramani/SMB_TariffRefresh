package PageFactory.Samsung_Aseries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BusinessMobilePhonePage {

    WebDriver driver;
    public BusinessMobilePhonePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"filterArrow\"]")
    WebElement filter;

    @FindBy(xpath = "//*[@class= 'linkToggler brandBtn']")
    WebElement brand;

    @FindBy(xpath = "//*[@id=\"u5502_input\"]")
    WebElement samsung;

    @FindBy(xpath = "//*[@id=\"donebtnF\"]")
    WebElement done;

    public void business_page()
    {
        filter.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        brand.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        samsung.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        done.click();
    }
}
