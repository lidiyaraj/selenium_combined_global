package objectrpository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(linkText="Organizations")
private WebElement Org_tab;

@FindBy(linkText="Create an Organization")
private WebElement create_link;

public WebElement getOrg_tab() {
	return Org_tab;
}

public WebElement getCreate_link() {
	return create_link;
}	
}
