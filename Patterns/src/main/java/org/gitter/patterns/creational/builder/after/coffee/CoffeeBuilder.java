package org.gitter.patterns.creational.builder.after.coffee;

import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;

public class CoffeeBuilder {
	private Size size;
	private Caffeine caffeine = Caffeine.FULL;
	private Dairy dairy = Dairy.NONE;
	private Drizzle drizzle = Drizzle.NONE;
	private Flavor flavor = Flavor.NONE;
	private Sweetener sweetener = Sweetener.NONE;
	private Temperature temperature = Temperature.HOT;
	private boolean withWhipCream = false;
	private boolean withSprinkles = false;
	
	public Coffee build() {
		if (size == null) {
			throw new IllegalStateException("size is required");
		}
		
		Coffee result = new Coffee();
		
		result.setSize(size);
		result.setCaffeine(caffeine);
		result.setDairy(dairy);
		result.setDrizzle(drizzle);
		result.setFlavor(flavor);
		result.setSweetener(sweetener);
		result.setTemperature(temperature);
		result.setWithWhipCream(withWhipCream);
		result.setWithSprinkles(withSprinkles);
		
		return result;
	}

	public void withSize(Size size) {
		this.size = size;
	}
	
	public void withCaffeine(Caffeine caffeine) {
		this.caffeine = caffeine;
	}

	public void withDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public void withDrizzle(Drizzle drizzle) {
		this.drizzle = drizzle;
	}

	public void withFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public void withSweetener(Sweetener sweetener) {
		this.sweetener = sweetener;
	}

	public void withTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public void withWhipCream() {
		withWhipCream = true;
	}

	public void withSprinkles() {
		withSprinkles = true;
	}
}
