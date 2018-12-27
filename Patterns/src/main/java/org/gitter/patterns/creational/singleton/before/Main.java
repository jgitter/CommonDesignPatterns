package org.gitter.patterns.creational.singleton.before;

public class Main {

	public static void main(String[] args) {
		long startTimestamp = System.currentTimeMillis();
		
		for (int index = 0; index < 1000; index++) {
			new Process().run();
		}
		
		long duration = System.currentTimeMillis() - startTimestamp;
		
		System.out.println("Process ran for " + duration + " milliseconds.");
	}

}
