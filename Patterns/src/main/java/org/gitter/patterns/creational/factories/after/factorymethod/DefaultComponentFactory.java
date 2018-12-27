package org.gitter.patterns.creational.factories.after.factorymethod;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DefaultComponentFactory implements ComponentFactory {

	@Override
	public JFrame buildFrame() {
		JFrame frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

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
