package org.gitter.patterns.creational.builder.after;

import org.gitter.patterns.creational.builder.after.coffee.Coffee;
import org.gitter.patterns.creational.builder.after.coffee.CoffeeBuilder;
import org.gitter.patterns.creational.builder.after.coffee.FluentCoffeeBuilder;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Size;

public class Client {

	public static void main(String[] args) {

		grabSomeJoe().drink();
		
		grabSomeJoeFluently().drink();
		
	}

	private static Coffee grabSomeJoe() {
		// can't do this anymore
		// Coffee coffee = new Coffee();

		CoffeeBuilder builder = new CoffeeBuilder();
		
		builder.withSize(Size.VENTI);
		builder.withDairy(Dairy.SKIM);
		builder.withWhipCream();
		
		return builder.build();
	}

	private static Coffee grabSomeJoeFluently() {

		return new FluentCoffeeBuilder()
				.withSize(Size.TALL)
				.withDairy(Dairy.SOY)
				.withSprinkles()
				.build();
	}
}
