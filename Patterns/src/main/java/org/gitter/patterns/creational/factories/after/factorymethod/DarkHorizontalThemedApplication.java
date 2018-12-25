package org.gitter.patterns.creational.factories.after.factorymethod;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class DarkHorizontalThemedApplication extends ApplicationBase {

	@Override
	protected JFrame buildFrame() {
		JFrame frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		return frame;
	}

	@Override
	protected JLabel buildLabel() {
		JLabel label = new JLabel("Click the button");
		label.setForeground(new Color(180, 255, 230));

		return label;
	}

	@Override
	protected JButton buildButton() {
		JButton button = new JButton("Click me");
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(new Color(180, 255, 230));

		return button;
	}

}