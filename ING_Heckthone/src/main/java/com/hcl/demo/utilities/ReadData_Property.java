package com.hcl.demo.utilities;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadData_Property {

		public static String getproper(String key) throws Exception
		{
			 Properties p = new Properties();
			 p.load(new FileInputStream("./src/main/java/config.properties"));
			 String data = p.getProperty(key);
			 return data;
			
		}
	}

