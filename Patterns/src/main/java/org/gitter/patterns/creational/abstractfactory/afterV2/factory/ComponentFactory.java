package org.gitter.patterns.creational.abstractfactory.afterV2.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Layout;
import org.gitter.patterns.creational.abstractfactory.Settings.Theme;

public class ComponentFactory implements IComponentFactory {
	
	private IComponentFactory factory;

	public ComponentFactory() {
		factory = buildFactory();
	}

	private static IComponentFactory buildFactory() {
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

	@Override
	public JFrame buildFrame() {
		return factory.buildFrame();
	}

	@Override
	public JLabel buildLabel() {
		return factory.buildLabel();
	}

	@Override
	public JButton buildButton() {
		return factory.buildButton();
	}
}
