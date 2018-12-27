package org.gitter.patterns.creational.singleton.after.usingioc;

import org.gitter.patterns.creational.singleton.before.Settings;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoContainer;
import org.picocontainer.defaults.DefaultPicoContainer;

public class Main {

	public static void main(String[] args) {
		PicoContainer container = getIocContainer();
		
		long startTimestamp = System.currentTimeMillis();
		
		for (int index = 0; index < 1000; index++) {
			Runnable runnable = (Runnable)container.getComponentInstanceOfType(Runnable.class);
			runnable.run();
		}
		
		long duration = System.currentTimeMillis() - startTimestamp;
		
		System.out.println("Process ran for " + duration + " milliseconds.");
	}

	public static PicoContainer getIocContainer() {
		MutablePicoContainer container = new DefaultPicoContainer();
		
		// singleton instance scope
		container.registerComponentInstance(new Settings());
		
		container.registerComponentImplementation(Process.class);
		
		return container;
	}
}
