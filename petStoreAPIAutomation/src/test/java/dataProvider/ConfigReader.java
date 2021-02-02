package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * This java class helps to read the details from configuration properties file
 * This is a Singleton class. So it ensures the creation of only one instance of a class in the JVM 
 * and enables a global access to that object. 
 */
public class ConfigReader {
	private Properties properties;
	private static ConfigReader configReader;

	private ConfigReader() {
	 BufferedReader reader;
	      String propertyFilePath = "configs/configuration.properties";
	         try {
	             reader = new BufferedReader(new FileReader(propertyFilePath));
	             properties = new Properties();
	             try {
	                 properties.load(reader);
	                 reader.close();
	             } catch (IOException e) {
	                 e.printStackTrace();
	             }
	         } catch (FileNotFoundException e) {
	             e.printStackTrace();
	             throw new RuntimeException("Configuration.properties file not found at " + propertyFilePath);
	         } 
	 }

	public static ConfigReader getInstance() {
		if (configReader == null) {
			configReader = new ConfigReader();
		}
		return configReader;
	}

	public String getBaseUrl() {
		String baseUrl = properties.getProperty("base_Url");
		if (baseUrl != null)
			return baseUrl;
		else
			throw new RuntimeException("base_Url not specified in the Configuration.properties file.");
	}

	public String getApiKey() {
		String apiKey = properties.getProperty("api_key");
		if (apiKey != null)
			return apiKey;
		else
			throw new RuntimeException("apiKey not specified in the Configuration.properties file.");
	}
}
