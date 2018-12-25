package org.gitter.patterns.creational.factories.after.abstractfactory;

import org.gitter.patterns.creational.factories.Settings;
import org.gitter.patterns.creational.factories.Settings.Layout;
import org.gitter.patterns.creational.factories.Settings.Theme;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.picocontainer.defaults.DefaultPicoContainer;

public class Main  {

	public static void main(String[] args) {
		PicoContainer container = getIocContainer();

		Application application = (Application)container.getComponentInstanceOfType(Application.class);
		
		application.run();
	}

	private static PicoContainer getIocContainer() {
		MutablePicoContainer container = new DefaultPicoContainer();

		Layout layout = Settings.getLayout();
		Theme theme = Settings.getTheme();

		if (layout == Layout.HORIZONTAL) {
			if (theme == Theme.DARK) {
				container.registerComponentImplementation(DarkHorizontalComponentFactory.class);
			} else if (theme == Theme.LIGHT) {
				container.registerComponentImplementation(LightHorizontalComponentFactory.class);
			}
		} else if (layout == Layout.VERTICAL) {
			if (theme == Theme.DARK) {
				container.registerComponentImplementation(DarkVerticalComponentFactory.class);
			} else if (theme == Theme.LIGHT) {
				container.registerComponentImplementation(LightVerticalComponentFactory.class);
			}
		}
		
		container.registerComponentImplementation(Application.class);

		return container;
	}
}
