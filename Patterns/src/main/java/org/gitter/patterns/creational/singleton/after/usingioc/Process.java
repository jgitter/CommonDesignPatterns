package org.gitter.patterns.creational.singleton.after.usingioc;

import org.gitter.patterns.creational.singleton.before.Settings;

public class Process implements Runnable {

	private Settings settings;

	public Process(Settings settings) {
		this.settings = settings;
	}
	
	@Override
	public void run() {
		System.out.println(settings.toString());
	}

}
