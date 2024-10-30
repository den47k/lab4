package adapter;

/**
 * Class representing a line that uses top-left coordinates.
 */
public class Line implements TopLeftCoordinates {
    public final int x1, y1, x2, y2;

    /**
     * Constructs a Line with specified start and end points.
     *
     * @param x1 the x-coordinate of the starting point
     * @param y1 the y-coordinate of the starting point
     * @param x2 the x-coordinate of the ending point
     * @param y2 the y-coordinate of the ending point
     */
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Draws the line using top-left coordinates.
     */
    @Override
    public void drawTopLeft() {
        System.out.println("Drawing a line (In top-left-centered coordinates system).");
        System.out.println("Start point: (" + x1 + ", " + y1 + ")");
        System.out.println("End point: (" + x2 + ", " + y2 + ")");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX1() {
        return this.x1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY1() {
        return this.y1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getX2() {
        return this.x2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getY2() {
        return this.y2;
    }
}
