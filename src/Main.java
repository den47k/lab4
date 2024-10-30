import adapter.*;

/**
 * Main class to demonstrate the adapter pattern with graphic elements.
 */
public class Main {

    /**
     * Main method to demonstrate the use of adapters to draw elements using different coordinate systems.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Rectangle with screen-centered coordinates
        CenterCoordinates rectangle = new Rectangle(-50, -50, 50, 50);
        rectangle.drawCenter();
        System.out.println();

        // Line with top-left corner-based coordinates
        TopLeftCoordinates line = new Line(0, 0, 500, 950);
        line.drawTopLeft();
        System.out.println();

        // Adapter to draw line with screen-centered coordinates
        CenterCoordinates adaptedLine = new CoordinatesAdapter(line);
        adaptedLine.drawCenter();
        System.out.println();
    }
}
