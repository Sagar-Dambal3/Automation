package com.qspiders.dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingIntoPropertyFile {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("browser", "chrome");
		
		FileOutputStream fos = new FileOutputStream("./data/writing.properties");
		p.store(fos, "writing into properties file");
		fos.close();
	}
}
