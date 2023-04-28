package PageFactory.Apple.iPhoneSE3rdGeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileProduct {
    WebDriver driver;
    public MobileProduct(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "(//*[@class='phone-source '])[2]")
    WebElement first;

    @FindBy(xpath = "(//*[@class='phone-source '])[16]")
    WebElement second;

    @FindBy(xpath = "(//*[@class='phone-source '])[6]")
    WebElement Third;

    public void FirstPhone() {
        first.click();
    }

    public void SecondPhone() {
        second.click();
    }

    public void ThirdPhone() {
        Third.click();
    }
}
