package eu.hoefel.astronomy;

import java.util.List;

/** The solar system. */
public enum Sol implements Star {

    /** The mother star of mankind, worshipped as a deity for thousands of years. */
    SOL;

    @Override public List<Planet> planets() { return List.of(SolarPlanet.values()); }
    @Override public double absoluteMagnitude() { return 4.83; }
    @Override public double mass() { return 1.98847e30; }
    @Override public double[][] position() { throw new IllegalStateException("Please implement this :-)"); }
}
