package org.gitter.patterns.creational.factories.after.factorymethod;

import org.gitter.patterns.creational.factories.Settings;
import org.gitter.patterns.creational.factories.Settings.Layout;
import org.gitter.patterns.creational.factories.Settings.Theme;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.picocontainer.defaults.DefaultPicoContainer;

public class Main  {

	public static void main(String[] args) {
		PicoContainer container = getIocContainer();
		
		Application application = (Application) container.getComponentInstanceOfType(Application.class);
		
		application.run();
	}

	private static PicoContainer getIocContainer() {
		MutablePicoContainer container = new DefaultPicoContainer();

		Layout layout = Settings.getLayout();
		Theme theme = Settings.getTheme();

		if (theme == Theme.LIGHT) {
			if (layout == Layout.HORIZONTAL) {
				container.registerComponentImplementation(DefaultComponentFactory.class);
			} else if (layout == Layout.VERTICAL) {
				container.registerComponentImplementation(VerticalComponentFactory.class);
			}
		} else if (theme == Theme.DARK) {
			if (layout == Layout.HORIZONTAL) {
				container.registerComponentImplementation(DarkComponentFactory.class);
			} else if (layout == Layout.VERTICAL) {
				container.registerComponentImplementation(DarkVerticalComponentFactory.class);
			}
		}
		
		container.registerComponentImplementation(Application.class);

		return container;
	}
}
