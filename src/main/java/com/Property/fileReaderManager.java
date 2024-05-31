package com.Property;

import java.io.IOException;

public class fileReaderManager {
	
private fileReaderManager() {
		
	}
	public static  fileReaderManager getInstansfilFileReaderManager() {
		fileReaderManager frm=new fileReaderManager();
		return frm;
	}
	public  configReader getInstansCofig() throws IOException{
		configReader cf=new configReader();
		return cf;
		
	}
}

