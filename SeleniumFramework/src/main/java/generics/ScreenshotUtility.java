package generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtility  extends BaseClass implements IAutoConstants {
	public String takingScreennshot(String screenshotname) {

		TakesScreenshot ts =(TakesScreenshot)driver;
		File photo = ts.getScreenshotAs(OutputType.FILE);
		//String time = LocalDateTime.now().toString().replace(":","-");
		//String directory = System.getProperty("user.dir");
		String path=DIRECTORY+""+SSPATH+screenshotname+" "+TIME+".png";
		File file = new File(path);
		try {

			FileUtils.copyFile(photo, file);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
}
