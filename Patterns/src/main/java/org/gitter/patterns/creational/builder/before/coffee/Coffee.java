package org.gitter.patterns.creational.builder.before.coffee;

import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;
import org.gitter.patterns.creational.builder.spec.Beverage;

/**
 * This coffee class is showcasing a common code smell with constructors that
 * grow out of control and become difficult to maintain. Setting defaults would
 * require creating alternative constructors with fewer parameters. This can
 * result in confusion for the clients depending on this class. We could also
 * create an empty constructor with a bunch of property setters, but then it
 * might be possible to create a coffee that is in an invalid state.
 */
public class Coffee implements Beverage {

	private Size size;
	private Caffeine caffeine;
	private Dairy dairy;
	private Drizzle drizzle;
	private Flavor flavor;
	private Sweetener sweetener;
	private Temperature temperature;
	private boolean withWhipCream;
	private boolean withSprinkles;

	public Coffee(Size size, Caffeine caffeine, Dairy dairy, Drizzle drizzle,
			Flavor flavor, Sweetener sweetener, Temperature temperature,
			boolean withWhipCream, boolean withSprinkles) {

		this.size = size;
		this.caffeine = caffeine;
		this.dairy = dairy;
		this.drizzle = drizzle;
		this.flavor = flavor;
		this.sweetener = sweetener;
		this.temperature = temperature;
		this.withWhipCream = withWhipCream;
		this.withSprinkles = withSprinkles;
		
		// you could do this first as well
		validate();
	}

	@Override
	public void drink() {
		System.out.println("mmmm");
	}

	private void validate() {
		if (caffeine == null) {
			throw new IllegalStateException("caffeine is required");
		}
		if (dairy == null) {
			throw new IllegalStateException("dairy is required");
		}
		if (drizzle == null) {
			throw new IllegalStateException("drizzle is required");
		}
		if (flavor == null) {
			throw new IllegalStateException("flavor is required");
		}
		if (sweetener == null) {
			throw new IllegalStateException("sweetener is required");
		}
		if (temperature == null) {
			throw new IllegalStateException("temperature is required");
		}
	}
}
