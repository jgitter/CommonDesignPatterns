package org.gitter.patterns.creational.builder.before;

import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;

public class Client {

	public static void main(String[] args) {

		grabSomeJoe();

		grabSomeMoreJoe();
	}

	private static void grabSomeJoe() {
		Coffee coffee = new Coffee(Size.GRANDE, Caffeine.HALF_CAF, Dairy.SOY,
				Drizzle.CARAMEL, Flavor.HAZELNUT, Sweetener.RAW,
				Temperature.HOT, true, false);

		coffee.drink();
	}

	private static void grabSomeMoreJoe() {
		AlternativeCoffee coffee = new AlternativeCoffee();

		coffee.setCaffeine(Caffeine.FULL);
		coffee.setTemperature(Temperature.ICED);

		try {
			// splat!
			coffee.drink();
		} catch (IllegalStateException e) {
			System.out.println("Where's my coffee?");
		}
	}
}
