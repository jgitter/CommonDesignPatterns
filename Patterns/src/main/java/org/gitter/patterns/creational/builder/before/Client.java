package org.gitter.patterns.creational.builder.before;

import org.gitter.patterns.creational.builder.before.coffee.AlternativeCoffee;
import org.gitter.patterns.creational.builder.before.coffee.Coffee;
import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;

public class Client {

	public static void main(String[] args) {

		Coffee coffee = grabSomeJoe();
		coffee.drink();

		AlternativeCoffee moreCoffee = grabSomeMoreJoe();
		
		try {
			// splat!
			moreCoffee.drink();
		} catch (IllegalStateException e) {
			System.out.println("What happened to my coffee?");
		}
	}

	private static Coffee grabSomeJoe() {
		return new Coffee(Size.GRANDE, Caffeine.HALF_CAF, Dairy.SOY,
				Drizzle.CARAMEL, Flavor.HAZELNUT, Sweetener.RAW,
				Temperature.HOT, true, false);
	}

	private static AlternativeCoffee grabSomeMoreJoe() {
		AlternativeCoffee coffee = new AlternativeCoffee();

		coffee.setCaffeine(Caffeine.FULL);
		coffee.setTemperature(Temperature.ICED);
		
		return coffee;
	}
}
