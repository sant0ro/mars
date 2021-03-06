package nasa.mars.hover.aspect.dictionary;

import nasa.mars.hover.model.Coordinate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * Move Command
 * <p>
 * Translates the Position of a Coordinate
 * upon a new one based on the result of a Command
 *
 * @author @sant0ro
 * @version 1.2
 * @see Coordinate
 * @since 1.2
 */
@Component
@Qualifier("prototype")
public class MoveCommand extends AbstractCommand<Point> {

    /**
     * Get the current Heading and with it Moves the Coordinate instance
     *
     * @return A Point with the result of the Location
     */
    @Override
    public Point execute() {
        Coordinate temporary = (Coordinate) coordinate.heading.getCommand().execute();

        coordinate.translate(temporary.x, temporary.y);

        return coordinate.getLocation();
    }

    /**
     * Get's the Code of the Command
     *
     * @return Letter Code of the Command
     */
    public char code() {
        return 'M';
    }
}
