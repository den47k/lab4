package adapter;

/**
 * Adapter class to allow a TopLeftCoordinates element to be used as a CenterCoordinates element.
 */
public class CoordinatesAdapter implements CenterCoordinates {
    private final TopLeftCoordinates line;

    /**
     * Constructs a CoordinatesAdapter for a specified TopLeftCoordinates element.
     *
     * @param line the TopLeftCoordinates element to adapt
     */
    public CoordinatesAdapter(TopLeftCoordinates line) {
        this.line = line;
    }

    /**
     * Draws the adapted line using center coordinates.
     */
    @Override
    public void drawCenter() {
        System.out.println("Drawing a line (In screen-centered coordinates system).");
        System.out.println("Start point: (" + -(line.getX1() - 500) + ", " + (line.getY1() - 950) + ")");
        System.out.println("End point: (" + -(line.getX2() - 500) + ", " + (line.getY2() - 950) + ")");
    }
}
