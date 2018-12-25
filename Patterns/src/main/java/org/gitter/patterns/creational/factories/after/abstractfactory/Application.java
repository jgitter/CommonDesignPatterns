package org.gitter.patterns.creational.factories.after.abstractfactory;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class Application implements ActionListener {

	private IComponentFactory factory;

	private JFrame frame;
	private JLabel label;
	private JButton button;
	private AtomicInteger clicks = new AtomicInteger(0);

	public Application(IComponentFactory factory) {
		this.factory = factory;
	}

	public void run() {
		frame = factory.buildFrame();
		frame.setMinimumSize(new Dimension(200, 100));

		label = factory.buildLabel();
		label.setBorder(new EmptyBorder(10, 10, 10, 10));

		button = factory.buildButton();
		button.setBorder(new EmptyBorder(10, 10, 10, 10));
		button.addActionListener(this);

		frame.getContentPane().add(label);
		frame.getContentPane().add(button);

		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		int count = clicks.incrementAndGet();
		label.setText("Clicked " + count + (count == 1 ? " time" : " times"));
		frame.pack();
	}
}
