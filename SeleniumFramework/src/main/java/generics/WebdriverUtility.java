package generics;

	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class WebdriverUtility {
		/**
		 * this method is used to enter the data by using javascript
		 * @param driver
		 * @param element
		 * @param data
		 */
		public void enteringDataIntoTF(WebDriver driver,WebElement element,String data) {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();",element);
		}
		/**
		 * this method is used to click on javascriptexecutor
		 * @param driver
		 * @param index
		 */
		public void SwitchingToFrame(WebDriver driver,int index) {
			driver.switchTo().frame(index);
		}
		/**
		 * this method is used to switch the driver control from window to frame with name reference
		 * @param driver
		 * @param name
		 */
		public void SwitchingToFrame(WebDriver driver,String name) {
			driver.switchTo().frame(name);
		}
		/**
		 * this method is used to switch the driver control from window to frame with element reference
		 * @param driver
		 * @param element
		 */
		public void SwitchingToFrame(WebDriver driver,WebElement element) {
			driver.switchTo().frame(element);
		}
		/**
		 * this method is used to switch the driver control from window to default content
		 * @param driver
		 */
		public void SwitchingBackfromFrame(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		/**
		 * this method is used to switch the driver control from window to alert
		 * @param driver
		 * @return
		 */
		public Alert SwitchingToAlert(WebDriver driver) {
			return driver.switchTo().alert();	
		}
		/**
		 * this method is used to perform mouse hovering on particular element
		 * @param driver
		 * @param Element
		 */
		public void mouseHoveringOnElement(WebDriver driver,WebElement Element) {
			Actions act=new Actions(driver);
			act.moveToElement(Element).perform();
		}
		/**
		 * this method is used to handle the dropdown with reference of value or visible text
		 * @param dropdown
		 * @param value
		 */
		public void handlingDropDown(WebElement dropdown,String value) {
			Select select = new Select(dropdown);
			try {
				select.selectByValue(value);
			}	catch(NoSuchElementException e) {
				select.selectByVisibleText(value);
			}
		}
	/**
	 * this method is used to handle the dropdown with refernce of index
	 * @param dropdown
	 * @param value
	 */
		public void handlingDropDown(WebElement dropdown,int value) {
			Select select = new Select(dropdown);
			select.selectByIndex(value);
		}	
		public void switchtowindow(WebDriver driver,String parentWindowId,Set<String> alWindowId,String title) {
			alWindowId.remove(parentWindowId);
			for(String id:alWindowId) {
				driver.switchTo().window(id);
				if(driver.getTitle().contains(title)) {
					break;
				}
			}		
		}
		public void switchBacktoMainwindow(WebDriver driver,String parentwindowId) {{
			driver.switchTo().window(parentwindowId);
		}
		}
	}






