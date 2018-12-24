package org.gitter.patterns.creational.abstractfactory.afterV1.factory;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Layout;
import org.gitter.patterns.creational.abstractfactory.Settings.Theme;

public class ComponentFactoryFactory {
	
	public static IComponentFactory getComponentFactory() {
		Layout layout = Settings.getLayout();
		Theme theme = Settings.getTheme();
		
		if (layout == Layout.HORIZONTAL) {
			if (theme == Theme.DARK) {
				return new DarkHorizontalComponentFactory();
			}
			else if (theme == Theme.LIGHT) {
				return new LightHorizontalComponentFactory();
			}
		}
		else if (layout == Layout.VERTICAL) {
			if (theme == Theme.DARK) {
				return new DarkVerticalComponentFactory();
			}
			else if (theme == Theme.LIGHT) {
				return new LightVerticalComponentFactory();
			}
		}
		
		return null;
	}
}
