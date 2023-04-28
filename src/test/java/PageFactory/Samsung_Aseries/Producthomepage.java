package PageFactory.Samsung_Aseries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Producthomepage {

    WebDriver driver;
    public Producthomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"a7H9E0000003DJQUA2\"]/a")
    WebElement a13;

    @FindBy(xpath = "//*[@id=\"a7H9E000000JCfeUAG\"]/a")
    WebElement a33;

    @FindBy(xpath = "//*[@id=\"a7H9E000000JCfZUAW\"]/a")
    WebElement a53;

    @FindBy(xpath = "//*[@id=\"a7H9E0000003DKiUAM\"]/a")
    WebElement a03;

    @FindBy(xpath = "//*[@id=\"a7H9E0000002meiUAA\"]/a")
    WebElement a52s;

    @FindBy(xpath = "//*[@id=\"a7H9E0000002jmnUAA\"]/a")
    WebElement a22;

    public void product_a13()
    {
        a13.click();
    }

    public void product_a33()
    {
        a33.click();
    }

    public void product_a03()
    {
        a03.click();
    }

    public void product_a52s()
    {
        a52s.click();
    }

    public void product_a22()
    {
        a22.click();
    }

    public void product_a53()
    {
        a53.click();
    }

}
