package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility implements IAutoConstants{
	
	public String readingDataPropertyFile(String key) {
		FileInputStream fis=null;
		try { 
			fis=new FileInputStream(PROPERTYFILEPATH);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties ppt = new Properties();
		try {
			ppt.load(fis);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return ppt.getProperty(key);
	}
}

