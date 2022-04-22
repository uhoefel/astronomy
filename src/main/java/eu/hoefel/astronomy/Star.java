package eu.hoefel.astronomy;

import java.util.List;

/**
 * Interface for stars.
 * 
 * @apiNote Implementations should be singletons.
 */
public interface Star {

    // TODO: one could add a spectral class enum, and have a method for each star

    /**
     * Planets attached to this star.
     * 
     * @return attached planets
     */
    public List<Planet> planets();

    /**
     * The absolute magnitude, i.e. the apparent magnitude the star would have in a
     * distance of 10 parsec.
     * 
     * @return the absolute magnitude
     */
    public double absoluteMagnitude();

    /**
     * The approximate mass of the star in kg.
     * 
     * @return the mass
     */
    public double mass();

    /**
     * The position of the star in the
     * <a href="https://doi.org/10.1046/j.1365-8711.2000.03145.x">supergalactic
     * coordinate system</a>.
     * 
     * @return the position, [SGB/SGL/distance in parsec][1]
     */
    public double[][] position();
}
