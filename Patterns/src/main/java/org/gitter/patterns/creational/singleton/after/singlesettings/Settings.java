package org.gitter.patterns.creational.singleton.after.singlesettings;

import java.util.Properties;

public class Settings {

	private static Settings INSTANCE;
	
	private Properties properties = new Properties();

	public static Settings getInstance() {
		if (INSTANCE == null) {
			synchronized (Settings.class) {
				if (INSTANCE == null) {
					INSTANCE = new Settings();
				}
			}
		}
		
		return INSTANCE;
	}

	private Settings() {
		try {
			properties.loadFromXML(Settings.class.getResourceAsStream("../../settings.xml"));
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}


	public String getLorem() {
		return properties.getProperty("lorem");
	}

	public Integer getIpsum() {
		return Integer.parseInt(properties.getProperty("ipsum"));
	}

	public Integer getDolor() {
		return Integer.parseInt(properties.getProperty("dolor"));
	}

	public Integer getSit() {
		return Integer.parseInt(properties.getProperty("sit"));
	}

	public String getAmet() {
		return properties.getProperty("amet");
	}

	public String getConsectetur() {
		return properties.getProperty("consectetur");
	}

	public Integer getAdipiscing() {
		return Integer.parseInt(properties.getProperty("adipiscing"));
	}

	public String getElit() {
		return properties.getProperty("elit");
	}
	
	public String toString() {
		return String.format("{%d}: %s, %d, %d, %d, %s, %s, %d, %s", hashCode(), getLorem(), getIpsum(), getDolor(), getSit(), getAmet(), getConsectetur(), getAdipiscing(), getElit());
	}
}
