package eu.hoefel.astronomy;

import java.util.List;

/** Solar planets. Could be extended to include Ceres etc. */
public enum SolarPlanet implements Planet {

	/**
	 * Mercury, named after the Roman messenger god is the planet closest to the 
	 * {@link Sol#SOL Sun}.
	 */
	MERCURY(3.3011e23),

	/**
	 * Venus is named after the Roman goddess of love. It is the planet that comes
	 * closest to {@link #EARTH Earth}.
	 */
	VENUS(4.8675e24),

	/**
	 * Also known as Terra, the only astronomical body known to be able to harbour
	 * life.
	 */
	EARTH(5.97237e24),

	/**
	 * Mars is named after the Roman god of war. It most likely will be the first
	 * planet to be colonized by humans.
	 */
	MARS(6.4171e23),

	/**
	 * Jupiter is named after the Roman god of the sky and lightning. It is the
	 * heaviest planet in the {@link Sol solar system}.
	 */
	JUPITER(1.8982e27),

	/**
	 * Saturn is named after the Roman god of wealth and agriculture. Like
	 * {@link #JUPITER Jupiter} it is a gas giant.
	 */
	SATURN(5.6834e26),

	/**
	 * Uranus is named after the Greek primordial god of the sky. It is an ice
	 * giant.
	 */
	URANUS(8.6810e25),

	/**
	 * Neptune is named after the Roman god of the seas. Like {@link #URANUS Uranus}
	 * it is an ice giant.
	 */
	NEPTUNE(1.02413e26),

	/**
	 * Pluto is named after the Greek god of the underworld. It is an icy dwarf
	 * planet in the Kuiper belt.
	 */
	PLUTO(1.303e22);

	/** The approximate mass in kg. */
	private double mass;

	/**
	 * Constructs a new solar planet.
	 * 
	 * @param mass the approximate mass
	 */
	private SolarPlanet(double mass) {
		this.mass = mass;
	}

	@Override public List<Star> stars() { return List.of(Sol.values()); }
	@Override public double mass() { return mass; }
	@Override public boolean isMinor() { return this == PLUTO; }
}
