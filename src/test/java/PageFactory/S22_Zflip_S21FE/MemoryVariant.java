package PageFactory.S22_Zflip_S21FE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MemoryVariant {

    WebDriver driver;
    public MemoryVariant(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class= \"click-memory-128 click-memory memory-click-selected\"]")
    WebElement dropdown;

    @FindBy(xpath = "//*[@class= \"256GB selected-background sel-background\"]")
    WebElement select256gb;

    @FindBy(xpath = "//*[@class= \"buttonInitial buttonLarge blueLight select-variant\"]")
    WebElement viewalltariff;

    public void memory_variant()
    {
        dropdown.click();
        select256gb.click();
        viewalltariff.click();
    }

    public void viewall_tariff()
    {
        viewalltariff.click();
    }

}
