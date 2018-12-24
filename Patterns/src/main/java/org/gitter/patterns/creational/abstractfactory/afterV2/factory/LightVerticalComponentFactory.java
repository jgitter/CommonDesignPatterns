package org.gitter.patterns.creational.abstractfactory.afterV2.factory;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class LightVerticalComponentFactory implements IComponentFactory {
	
	LightVerticalComponentFactory() {}

	@Override
	public JFrame buildFrame() {
		JFrame frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

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