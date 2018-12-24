package org.gitter.patterns.creational.abstractfactory.afterV3.factory;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Layout;

class DarkComponentFactory implements IComponentFactory {

	DarkComponentFactory() {}
	
	@Override
	public JFrame buildFrame() {
		JFrame frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), 
				Settings.getLayout() == Layout.HORIZONTAL ? BoxLayout.X_AXIS : BoxLayout.Y_AXIS));
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		return frame;
	}

	@Override
	public JLabel buildLabel() {
		JLabel label = new JLabel("Click the button");
		label.setForeground(new Color(180, 255, 230));

		return label;
	}

	@Override
	public JButton buildButton() {
		JButton button = new JButton("Click me");
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(new Color(180, 255, 230));

		return button;
	}

}
