package org.gitter.patterns.creational.abstractfactory.afterV3.factory;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public interface IComponentFactory {

	JFrame buildFrame();
	JLabel buildLabel();
	JButton buildButton();
	
}
