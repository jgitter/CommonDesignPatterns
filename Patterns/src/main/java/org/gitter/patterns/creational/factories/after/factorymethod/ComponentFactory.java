package org.gitter.patterns.creational.factories.after.factorymethod;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public interface ComponentFactory {

	JFrame buildFrame();

	JLabel buildLabel();

	JButton buildButton();

}