package jdbc.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestingProperties {
	public static void main(String args[]) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Eera\\Desktop\\java\\practice1\\JdbcConnect\\appinfo.properties");
		
		Properties properties = new Properties();
		
		properties.load(fis);
		
		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("url"));
		System.out.println(properties.getProperty("pass"));
		
		
	}
}
