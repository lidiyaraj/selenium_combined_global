package leads;

import org.testng.annotations.Test;

import generics.BaseClass;
import generics.WebdriverUtility;

public class FT_Lead_02_test extends BaseClass {
	
	@Test
	
	public void Creating_lead_from_dropdown() throws InterruptedException {
	//	util= new WebdriverUtility();
	dropdown.getQuick_create().click();
	dropdown.getAssignTo();
	dropdown.getCompany().sendKeys("Trinity");
	dropdown.getFirstname().sendKeys("Sai");
	dropdown.getFirstname().sendKeys("Kumar");
	dropdown.getPhonenumber().sendKeys("84562347");
	//util.handlingDropdown(create.getQuick_create(),"leads");
	
	Thread.sleep(10000);
	
}
}