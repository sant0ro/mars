package nasa.mars.hover.service.builder;

import nasa.mars.hover.model.Map;
import nasa.mars.hover.service.IBuilder;

/**
 * Map Builder
 *
 * Used to build specific Maps
 *
 * @author @sant0ro
 * @version 1.1
 * @since 1.1
 */
public abstract class MapBuilder implements IBuilder<Map> {

    /**
     * Build the Height of te Map
     */
    abstract void buildHeight();

    /**
     * Build the Width of the Map
     */
    abstract void buildWidth();

    /**
     * Build the Name of the Map
     */
    abstract void buildName();

    /**
     * Get the result Map
     *
     * @return Map Instance
     */
    @Override
    public abstract Map build();
}