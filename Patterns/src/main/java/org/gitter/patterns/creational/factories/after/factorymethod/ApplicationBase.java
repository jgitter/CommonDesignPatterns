package org.gitter.patterns.creational.factories.after.factorymethod;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public abstract class ApplicationBase implements ActionListener {

	private JFrame frame;
	private JLabel label;
	private JButton button;
	private AtomicInteger clicks = new AtomicInteger(0);

	public void run() {
		frame = buildFrame();
		frame.setMinimumSize(new Dimension(200, 100));

		label = buildLabel();
		label.setBorder(new EmptyBorder(10, 10, 10, 10));

		button = buildButton();
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

	protected abstract JButton buildButton();

	protected abstract  JLabel buildLabel();

	protected abstract  JFrame buildFrame();

}
