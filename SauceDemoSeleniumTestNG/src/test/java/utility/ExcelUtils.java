package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pages.TestBase;

public class ExcelUtils extends TestBase{
	/*
	 * @description : reads the data from a map corresponding to the key passed as String argument
	 * @param : key for which data is to be fetched
	 * @param : map in which data is stored
	 * @return : row data as a list
	 * @date : 04 Feb 2019
	 * @author : Jewel R
	 */
	public static List<String> getTestData(String methodName, Map<String, List<String>> testSuiteData) {
	    List<String> testData = new ArrayList<String>();

	    testData = testSuiteData.get(methodName);
	    return testData;
	}

}
