package org.gitter.patterns.creational.factories.after.factorymethod;

import org.gitter.patterns.creational.factories.Settings;
import org.gitter.patterns.creational.factories.Settings.Layout;
import org.gitter.patterns.creational.factories.Settings.Theme;

public class Main  {

	public static void main(String[] args) {
		getApplication().run();
	}

	private static ApplicationBase getApplication() {
		Layout layout = Settings.getLayout();
		Theme theme = Settings.getTheme();

		if (layout == Layout.HORIZONTAL) {
			if (theme == Theme.DARK) {
				return new DarkHorizontalThemedApplication();
			} else if (theme == Theme.LIGHT) {
				return new LightHorizontalThemedApplication();
			}
		} else if (layout == Layout.VERTICAL) {
			if (theme == Theme.DARK) {
				return new DarkVerticalThemedApplication();
			} else if (theme == Theme.LIGHT) {
				return new LightVerticalThemedApplication();
			}
		}
		
		return null;
	}
}
