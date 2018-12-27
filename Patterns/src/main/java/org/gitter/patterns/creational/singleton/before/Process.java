package org.gitter.patterns.creational.singleton.before;

public class Process implements Runnable {

	@Override
	public void run() {
		Settings settings = new Settings();
		System.out.println(settings.toString());
	}

}
