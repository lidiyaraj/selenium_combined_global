package objectrpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	public LeadPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Leads")
	private WebElement lead;

	@FindBy(linkText="Create a Lead")
	private WebElement create;

	@FindBy(name="firstname")
	private  WebElement First_name;

	@FindBy(name="lastname")
	private WebElement Last_name;

	@FindBy(name="company")
	private WebElement Com;

	@FindBy(id="phone")
	private WebElement Phone_number;

	@FindBy(id="email")
	private WebElement EmailTF;
	
	@FindBy(name="button")
	private WebElement Savebutton;

	public WebElement getLead() {
		return lead;
	}

	public WebElement getCreate() {
		return create;
	}	
	public WebElement getFirst_name() {
		return First_name;
	}

	public WebElement getLast_name() {
		return Last_name;
	}

	public WebElement getCom() {
		return Com;
	}

	public WebElement getPhone_number() {
		return Phone_number;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}
	public WebElement getSavebutton() {
	return Savebutton;
}
}