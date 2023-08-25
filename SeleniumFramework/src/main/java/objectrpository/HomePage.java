package objectrpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}	
	@FindBy(xpath="(//img[@style='padding: 0px;padding-left:5px'])[1]")	
	private WebElement adminstrationIcon;

	@FindBy(linkText ="Sign Out")
	private WebElement SignOut;

	public WebElement getadminstrationIcon() {
		return adminstrationIcon;
	}

	public WebElement getSignOut() {
		return SignOut;
	}
	public void Signingout() {
		getadminstrationIcon().click();
		getSignOut().click();
	}

}
