
package objectrpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddInformationPage {
		public AddInformationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
	}

		@FindBy(name="accountname")
		private WebElement Org_name;

		@FindBy(id="employees")
		private WebElement Employeenumber;
		
		@FindBy(id="phone")
		private WebElement phonenumber;	
		
		@FindBy(name="button")
		private WebElement save_button;

public WebElement getOrg_name() {
	return Org_name;
}

public WebElement getEmployeenumber() {
	return Employeenumber;
}

public WebElement getPhonenumber() {
	return phonenumber;
}
public WebElement getSave_button() {
	return save_button;
}
}