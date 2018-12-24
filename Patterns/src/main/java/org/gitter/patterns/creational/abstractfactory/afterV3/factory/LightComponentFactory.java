package org.gitter.patterns.creational.abstractfactory.afterV3.factory;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Layout;

class LightComponentFactory implements IComponentFactory {
	
	LightComponentFactory() {}

	@Override
	public JFrame buildFrame() {
		JFrame frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), 
				Settings.getLayout() == Layout.HORIZONTAL ? BoxLayout.X_AXIS : BoxLayout.Y_AXIS));

		return frame;
	}

	@Override
	public JLabel buildLabel() {
		return new JLabel("Click the button");
	}

	@Override
	public JButton buildButton() {
		return new JButton("Click me");
	}
}
