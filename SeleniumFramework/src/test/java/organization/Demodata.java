package organization;

import org.testng.annotations.Test;

import generics.ExcelUtility;

public class Demodata {
	
	@Test(dataProvider = "testdata",dataProviderClass = ExcelUtility.class)
	
	public void demo(String data1,String data2) {
			
			System.out.println(data1);
			System.out.println(data2);
	
	}
}
