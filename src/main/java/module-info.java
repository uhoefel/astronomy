/**
 * This module provides support for astronomy.
 * <p>
 * The {@link eu.hoefel.astronomy} is the package containing the base classes
 * needed to describe stars, planets and natural satellites as well as example
 * implementations.
 * 
 * @author Udo Hoefel
 */
module eu.hoefel.astronomy {
	exports eu.hoefel.astronomy;

	// ugh...
	opens eu.hoefel.astronomy to org.junit.platform.commons;
}