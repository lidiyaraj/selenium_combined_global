package leads;

import org.testng.annotations.Test;

import generics.BaseClass;

public class FT_Lead_01_test extends BaseClass {
	
	@Test
	 public void Creating_a_new_lead_information() throws InterruptedException {
		
		lead.getLead().click();
		lead.getCreate().click();
		lead.getCom().sendKeys("Integra");
		lead.getFirst_name().sendKeys("ASHWIN");
		lead.getLast_name().sendKeys("k");
		lead.getPhone_number().sendKeys("77368990");
		lead.getEmailTF().sendKeys("aaa@gmail.com");
		lead.getSavebutton().click();
		
		Thread.sleep(10000);
}
}