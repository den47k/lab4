package adapter;

/**
 * Class representing a rectangle that uses center coordinates.
 */
public class Rectangle implements CenterCoordinates {
    private final int x1, y1, x2, y2;

    /**
     * Constructs a Rectangle with specified start and end points.
     *
     * @param x1 the x-coordinate of the starting point
     * @param y1 the y-coordinate of the starting point
     * @param x2 the x-coordinate of the ending point
     * @param y2 the y-coordinate of the ending point
     */
    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Draws the rectangle using center coordinates.
     */
    @Override
    public void drawCenter() {
        System.out.println("Drawing a rectangle (In screen-centered coordinates system).");
        System.out.println("Start point: (" + x1 + ", " + y1 + ")");
        System.out.println("End point: (" + x2 + ", " + y2 + ")");
    }
}
