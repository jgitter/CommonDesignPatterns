package org.gitter.patterns.creational.factories.after.abstractfactory;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public interface IComponentFactory {

	JFrame buildFrame();
	JLabel buildLabel();
	JButton buildButton();
	
}
