package com.lhy.propertites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
//		write();
		read();
	}

	private static void read() {
		try {
			Properties p = new Properties();
			File file = new File("e://lhy.properties");
			FileInputStream fip = new FileInputStream(file);
			p.load(fip);
			fip.close();
			String name = p.getProperty("name");
			System.out.println(name);
		} catch (Exception e) {

		}
	}

	private static void write() {
		Properties p = new Properties();
		p.setProperty("name", "lhy");
		File f = new File("e://lhy.properties");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileOutputStream fop = null;
		try {
			fop = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p.store(fop, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fop.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
