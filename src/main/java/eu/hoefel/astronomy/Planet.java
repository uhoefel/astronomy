package eu.hoefel.astronomy;

import java.util.List;

/**
 * Interface for planets, including minor planets. For the logic see <a href=
 * "https://en.wikipedia.org/wiki/Minor_planet#/media/File:Euler_diagram_of_solar_system_bodies.svg">this
 * diagram</a>
 * 
 * @apiNote Implementations should override equals and hashCode.
 */
public interface Planet {

	/** Alias for "no planet". */
	public static final Planet NONE = new Planet() {
		@Override public List<Star> stars() { return List.of(); }
		@Override public double mass() { return Double.NaN; }
		@Override public boolean isMinor() { return false; }
	};

	/**
	 * The {@link Star star(s)}, around which the planet revolves.
	 * 
	 * @return the "parent" stars
	 */
	public List<Star> stars();

	/**
	 * The approximate mass in kg.
	 * 
	 * @return the mass in kg
	 */
	public double mass();

	/**
	 * True if the planet is a minor planet.
	 * 
	 * @return true for minor planets
	 */
	public boolean isMinor();
}
