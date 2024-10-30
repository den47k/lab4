package adapter;

/**
 * Interface for elements that can be drawn using top-left coordinates.
 */
public interface TopLeftCoordinates {

    /**
     * Draws the element based on top-left-centered coordinates.
     */
    void drawTopLeft();

    /**
     * Gets the x-coordinate of the starting point.
     *
     * @return the x-coordinate of the start point
     */
    int getX1();

    /**
     * Gets the y-coordinate of the starting point.
     *
     * @return the y-coordinate of the start point
     */
    int getY1();

    /**
     * Gets the x-coordinate of the ending point.
     *
     * @return the x-coordinate of the end point
     */
    int getX2();

    /**
     * Gets the y-coordinate of the ending point.
     *
     * @return the y-coordinate of the end point
     */
    int getY2();
}
