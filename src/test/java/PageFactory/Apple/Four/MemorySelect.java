package PageFactory.Apple.Four;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MemorySelect {
    WebDriver driver;
    public MemorySelect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //For 128GB
    @FindBy(xpath = "//*[@class='click-memory-64 click-memory memory-click-selected']")
    WebElement Arrow128GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect128\"]/div[1]")
    WebElement select128GB;
    public void select128Memory() {
        Arrow128GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        select128GB.click();
    }

    //For 256GB
    @FindBy(xpath = "//*[@class='click-memory-64 click-memory memory-click-selected']")
    WebElement Arrow256GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect256\"]/div[1]")
    WebElement select256GB;
    public void select256Memory() {
        Arrow256GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        select256GB.click();
    }

}
