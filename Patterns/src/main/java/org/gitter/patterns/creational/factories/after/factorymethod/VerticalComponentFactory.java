package org.gitter.patterns.creational.factories.after.factorymethod;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class VerticalComponentFactory extends DefaultComponentFactory implements ComponentFactory {

	@Override
	public JFrame buildFrame() {
		JFrame frame = super.buildFrame();
		
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		return frame;
	}

}
