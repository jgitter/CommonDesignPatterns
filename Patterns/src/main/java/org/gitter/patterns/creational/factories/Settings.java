package org.gitter.patterns.creational.factories;

import java.io.IOException;
import java.util.Properties;

public class Settings {

	public enum Layout { HORIZONTAL, VERTICAL }
	
	public enum Theme { LIGHT, DARK }
	
	private static final Properties properties;
	
	static {
		properties = new Properties();
		try {
			properties.load(Settings.class.getResourceAsStream("settings.properties"));
		} catch (IOException e) {
			System.out.println("Splat!");
		}		
	}
	
	public static Layout getLayout() {
		return Layout.valueOf((String)properties.get("layout"));
	}
	
	public static Theme getTheme() {
		return Theme.valueOf((String)properties.get("theme"));
	}
}
