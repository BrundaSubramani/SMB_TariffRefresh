package PageFactory.Apple.Five;

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


    //For 256GB
    @FindBy(xpath = "//*[@class='click-memory-128 click-memory memory-click-selected']")
    WebElement Arrow256GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect256\"]/div[1]")
    WebElement select256GB;

    public void select256Memory() {
        Arrow256GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        select256GB.click();
    }

    //For 512GB
    @FindBy(xpath = "//*[@class='click-memory-128 click-memory memory-click-selected']")
    WebElement Arrow512GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect512\"]/div[1]")
    WebElement select512GB;
    public void select512Memory() {
        Arrow512GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        select512GB.click();
    }

    //For 1000GB
    @FindBy(xpath = "//*[@class='click-memory-128 click-memory memory-click-selected']")
    WebElement Arrow1000GB;

    @FindBy(xpath = "//*[@id=\"memsize memsizeSelect1000\"]/div[1]")
    WebElement select1000GB;
    public void select1000Memory() {
        Arrow1000GB.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        select1000GB.click();
    }
}
