package org.gitter.patterns.creational.singleton.after.singlesettings;

public class Process implements Runnable {

	@Override
	public void run() {
		Settings settings = Settings.getInstance();
		System.out.println(settings.toString());
	}

}
