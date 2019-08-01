package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(".\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		String env = prop.getProperty("env", "test");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(env);
	}

}
