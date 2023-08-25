package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectrpository.AddInformationPage;
import objectrpository.HomePage;
import objectrpository.LeadPage;
import objectrpository.Lead_dropdownPage;
import objectrpository.LoginPage;
import objectrpository.OrganizationPage;

public class BaseClass {
	public static WebDriver driver;
	public PropertyUtility property;
	public LoginPage login;
	public HomePage home;
	public OrganizationPage organization;
	public AddInformationPage add;
	public LeadPage lead;
	public Lead_dropdownPage dropdown;
	WebdriverUtility utility;
	
	@BeforeClass	
	public void launchingBrowser() {
		property = new PropertyUtility();
		utility = new WebdriverUtility();
		if(property.readingDataPropertyFile("browser").equalsIgnoreCase("chrome")) {
		//	WebDriverManager.chromedriver().setup();
		//	driver=new ChromeDriver();
		}else if(property.readingDataPropertyFile("browser").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			//	WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);		
	}
	@BeforeMethod
	public void naviagatingToApplication() {
		dropdown = new Lead_dropdownPage(driver);
		organization = new OrganizationPage(driver);
		login = new LoginPage(driver);
		home = new HomePage(driver);
		add = new AddInformationPage(driver);
		lead = new LeadPage(driver);
		driver.get(property.readingDataPropertyFile("url"));
		login.loginToApplication(property.readingDataPropertyFile("username"),property.readingDataPropertyFile("password"));
	}
	@AfterMethod
	public void signOutFromApplication() {
		utility.mouseHoveringOnElement(driver,home.getadminstrationIcon());
		home.getSignOut().click();
		System.out.println("signed out");
	}
	@AfterClass
	public void closingTheBrowser() {
		driver.quit();
	}
}

