package com.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	
	
	public static Properties p;
	
	public configReader() throws IOException {
		File f=new File("C:\\Users\\91824\\eclipse-workspace\\CucumberFramework\\src\\main\\java\\com\\Property\\configReader.java");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
	}
	
	public  String getUrl(){
		String	url=p.getProperty("url");
		return url;
	}
	public  String getUsername(){
		String	username=p.getProperty("username");
		return username;
	}
	public  String getPassword(){
		String	password=p.getProperty("password");
		return password;
	}

}

