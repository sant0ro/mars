package nasa.mars.hover.aspect;

import nasa.mars.hover.model.Coordinate;

/**
 * Martian Command Interface
 * <p>
 * Specifies a Martian Command
 * execution and design
 *
 * @author @sant0ro
 * @version 1.2
 * @see Coordinate
 * @since 1.2
 */
public interface Command<T> {

    /**
     * Execute the Command
     * and what it specifies
     */
    T execute();

    /**
     * Get's the Code of the Command
     *
     * @return Letter Code of the Command
     */
    char code();

    /**
     * Fluent Setter to set the related
     * Coordinate and return the Command
     *
     * @param coordinate the related Coordinate
     * @return self
     */
    Command coordinate(Coordinate coordinate);
}
