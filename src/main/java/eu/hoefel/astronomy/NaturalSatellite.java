package eu.hoefel.astronomy;

/**
 * Interface for all kind of natural satellites.
 * 
 * @apiNote Implementations should be singletons.
 */
public interface NaturalSatellite {

	/**
	 * Gets the "parent" planet.
	 * 
	 * @return the "parent" planet, or {@link Planet#NONE NONE} if no parent planet
	 *         exists.
	 */
	public Planet planet();
}
