package nasa.mars.hover.aspect.dictionary;

import nasa.mars.hover.aspect.Command;
import nasa.mars.hover.model.Coordinate;

/**
 * Abstract Command
 * <p>
 * An Abstract Command that executes
 * iterations with a Coordinate
 *
 * @author @sant0ro
 * @version 1.2
 * @see nasa.mars.hover.model.Coordinate
 * @since 1.2
 */
public abstract class AbstractCommand<T> implements Command<T> {

    /**
     * Coordinate Point to be iterated
     */
    protected Coordinate coordinate = new Coordinate();

    /**
     * Set the related Coordinate to be Manipulated
     *
     * @param coordinate The related Coordinate
     */
    public Command coordinate(Coordinate coordinate) {
        this.coordinate = coordinate;

        return this;
    }

    /**
     * Get's the Code of the Command
     *
     * @return Letter Code of the Command
     */
    public char code() {
        return ' ';
    }
}
