package PageFactory.S22_Zflip_S21FE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"a7H9E000000JCEOUA4\"]/a")
    WebElement s22plus;

    @FindBy(xpath = "//*[@id=\"a7H9E0000002hNUUAY\"]/a")
    WebElement zflip3;

    @FindBy(xpath = "//*[@id=\"a7H9E000000JC5xUAG\"]/a")
    WebElement s21fe;

    public void product_s22plus()
    {
        s22plus.click();
    }

    public void product_zflip3()
    {
        zflip3.click();
    }

    public void product_s21fe()
    {
        s21fe.click();
    }
}
