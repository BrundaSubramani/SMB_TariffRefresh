package PageFactory.Nokia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDescriptionPage {
	
	WebDriver driver;
	public MobileDescriptionPage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "View all tariffs")
	WebElement tarrif_link;
	@FindBy(xpath = "//*[@id=\"memsize memsizeSelect64\"]/div[2]")
	WebElement memory;

	@FindBy(xpath = "//*[@id=\"memsize memsizeSelect128\"]/div[1]")
	WebElement gb;

	public void setMemory() throws InterruptedException {
		memory.click();
		Thread.sleep(1000);
		gb.click();

	}
	public void clickOnViewAllTariffs() {
		tarrif_link.click();

	}
}
