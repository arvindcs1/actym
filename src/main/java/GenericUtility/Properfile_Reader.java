package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properfile_Reader {
/*
 * This program is used to read data from property file
 */
	
  public String getPropertydata(String key) throws Throwable  {
	  FileInputStream fis = new FileInputStream("C:\\Users\\Vijay\\eclipse-workspace\\actym-framework\\src\\main\\resources\\testdata.properties");
	  Properties pr = new Properties();
	  pr.load(fis);  
	  String value = pr.getProperty(key);
	return value;
	  
  }
}
