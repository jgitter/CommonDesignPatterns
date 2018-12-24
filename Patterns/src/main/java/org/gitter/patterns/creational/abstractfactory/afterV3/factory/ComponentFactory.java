package org.gitter.patterns.creational.abstractfactory.afterV3.factory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Theme;

public class ComponentFactory implements IComponentFactory {

	private IComponentFactory factory;

	public ComponentFactory() {
		factory = buildFactory();
	}

	private static IComponentFactory buildFactory() {
		Theme theme = Settings.getTheme();

		if (theme == Theme.DARK) {
			return new DarkComponentFactory();
		} else if (theme == Theme.LIGHT) {
			return new LightComponentFactory();
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
