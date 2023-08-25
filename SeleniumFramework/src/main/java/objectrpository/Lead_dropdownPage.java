package objectrpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_dropdownPage {
	public Lead_dropdownPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="qccombo")
	private WebElement Quick_create;
	


	@FindBy(name="firstname")
	private WebElement Firstname;

	@FindBy(name="company")
	private WebElement Company;

	@FindBy(name="lastname")
	private WebElement Lastname;

	@FindBy(id="email")
	private WebElement EmailTF;

	@FindBy(id="phone")
	private WebElement Phonenumber;

	@FindBy(name="assigntype")
	private WebElement  AssignTo;

	public WebElement getQuick_create() {
		return Quick_create;
	}

	public WebElement getFirstname() {
		return Firstname;
	}

	public WebElement getCompany() {
		return Company;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmailTF() {
		return EmailTF;
	}

	public WebElement getPhonenumber() {
		return Phonenumber;
	}

	public WebElement getAssignTo() {
		return AssignTo;
	}
}

