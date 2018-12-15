package org.gitter.patterns.creational.builder.after.coffee;

import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;
import org.gitter.patterns.creational.builder.spec.Beverage;

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

	// intentionally package private constructor and setters
	Coffee() {}

	void setSize(Size size) {
		this.size = size;
	}

	void setCaffeine(Caffeine caffeine) {
		this.caffeine = caffeine;
	}

	void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	void setDrizzle(Drizzle drizzle) {
		this.drizzle = drizzle;
	}

	void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	void setSweetener(Sweetener sweetener) {
		this.sweetener = sweetener;
	}

	void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	void setWithWhipCream(boolean withWhipCream) {
		this.withWhipCream = withWhipCream;
	}

	void setWithSprinkles(boolean withSprinkles) {
		this.withSprinkles = withSprinkles;
	}

	@Override
	public void drink() {
		System.out.println("mmmm");
	}
}