package PageFactory.Samsung_S22_Ultra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class producthomepage {

    WebDriver driver;
    public producthomepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"a7H9E000000JCDuUAO\"]/a")
    WebElement s22ultra;

    @FindBy(xpath = "//*[@id=\"a7H9E0000002hNZUAY\"]/a")
    WebElement Zfold3;

    @FindBy(xpath = "//*[@id=\"a7H9E0000008CKlUAM\"]/a")
    WebElement s21ultra;

    public void product_s22()
    {
        s22ultra.click();
    }

    public void product_zfold()
    {
        Zfold3.click();
    }

    public void product_s21()
    {
        s21ultra.click();
    }



}
