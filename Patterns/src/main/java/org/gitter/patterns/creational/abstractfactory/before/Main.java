package org.gitter.patterns.creational.abstractfactory.before;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import org.gitter.patterns.creational.abstractfactory.Settings;
import org.gitter.patterns.creational.abstractfactory.Settings.Layout;
import org.gitter.patterns.creational.abstractfactory.Settings.Theme;

public class Main implements ActionListener {

	private JFrame frame;
	private JLabel label;
	private JButton button;
	private AtomicInteger clicks = new AtomicInteger(0);

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		frame = new JFrame("Application");
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(),
				Settings.getLayout().equals(Layout.HORIZONTAL) ? BoxLayout.X_AXIS : BoxLayout.Y_AXIS));
		frame.setMinimumSize(new Dimension(200, 100));
		if (Settings.getTheme() == Theme.DARK) {
			frame.getContentPane().setBackground(Color.DARK_GRAY);
		}

		label = new JLabel("Click the button");
		label.setBorder(new EmptyBorder(10, 10, 10, 10));

		if (Settings.getTheme() == Theme.DARK) {
			label.setForeground(new Color(180, 255, 230));
		}

		button = new JButton("Click me");
		button.addActionListener(this);
		button.setBorder(new EmptyBorder(10, 10, 10, 10));
		if (Settings.getTheme() == Theme.DARK) {
			button.setBackground(Color.DARK_GRAY);
			button.setForeground(new Color(180, 255, 230));
		}

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
