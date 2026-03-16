package utility;

import java.util.Properties;

import pages.TestBase;

public class ReadPropertyFile extends TestBase {
	
	static Properties prop=new Properties();
	static String propFileName="/SauceDemoSeleniumTestNG/src/test/java/utility/Config.properties";
	
	//ApplicationName
	
	public static String getApplicationName() {

		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(propFileName));

		} catch (Exception e) {
			e.printStackTrace();

		}
		return prop.getProperty("ApplicationName");

	}
	
	
	

}
