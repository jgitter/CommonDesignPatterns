package org.gitter.patterns.creational.builder.before;

import org.gitter.patterns.creational.builder.modifiers.Caffeine;
import org.gitter.patterns.creational.builder.modifiers.Dairy;
import org.gitter.patterns.creational.builder.modifiers.Drizzle;
import org.gitter.patterns.creational.builder.modifiers.Flavor;
import org.gitter.patterns.creational.builder.modifiers.Size;
import org.gitter.patterns.creational.builder.modifiers.Sweetener;
import org.gitter.patterns.creational.builder.modifiers.Temperature;

/**
 * This coffee class is showcasing a slight variation on the code smell where
 * the constructors are removed and instead setters are used to manage all of
 * the options post-creation. In this scenario, I may end up with an invalid
 * coffee if I forget to call one of the setters.
 */
public class AlternativeCoffee implements Beverage {

	private Size size = Size.GRANDE;
	private Caffeine caffeine;
	private Dairy dairy;
	private Drizzle drizzle;
	private Flavor flavor;
	private Sweetener sweetener;
	private Temperature temperature;
	private Boolean withWhipCream = false;
	private Boolean withSprinkles = false;

	public void setSize(Size size) {
		this.size = size;
	}

	public void setCaffeine(Caffeine caffeine) {
		this.caffeine = caffeine;
	}

	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}

	public void setDrizzle(Drizzle drizzle) {
		this.drizzle = drizzle;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}

	public void setSweetener(Sweetener sweetener) {
		this.sweetener = sweetener;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public void setWithWhipCream(boolean withWhipCream) {
		this.withWhipCream = withWhipCream;
	}

	public void setWithSprinkles(boolean withSprinkles) {
		this.withSprinkles = withSprinkles;
	}

	@Override
	public void drink() {
		validate();

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
