package org.gitter.patterns.creational.factories.after.factorymethod;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DarkComponentFactory extends DefaultComponentFactory implements ComponentFactory {

	@Override
	public JFrame buildFrame() {
		JFrame frame = super.buildFrame();

		frame.getContentPane().setBackground(Color.DARK_GRAY);

		return frame;
	}

	@Override
	public JLabel buildLabel() {
		JLabel label = super.buildLabel();

		label.setForeground(new Color(180, 255, 230));

		return label;
	}

	@Override
	public JButton buildButton() {
		JButton button = super.buildButton();

		button.setBackground(Color.DARK_GRAY);
		button.setForeground(new Color(180, 255, 230));

		return button;
	}

}
