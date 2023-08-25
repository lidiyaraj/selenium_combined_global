package organization;




import org.testng.annotations.Test;

import generics.BaseClass;
import generics.ExcelUtility;
import objectrpository.AddInformationPage;
import objectrpository.OrganizationPage;
//@Listeners(ListenerImplementation.class)
public class FT_Organization_01_test extends BaseClass {

	@Test(dataProvider = "testdata",dataProviderClass = ExcelUtility.class)

	public void Creating_a_organization(String Organizationname,String Employeenumber,String phonenumber) throws InterruptedException 
	{


		organization.getOrg_tab().click();
		organization.getCreate_link().click();

		add.getOrg_name().sendKeys(Organizationname);
	add.getEmployeenumber().sendKeys(Employeenumber);
		add.getPhonenumber().sendKeys(phonenumber);
		add.getSave_button().click();

		Thread.sleep(10000);
	}
}

