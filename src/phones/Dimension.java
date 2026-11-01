package phones;

import java.util.Locale;

/**
 * Dimension class that provides the height, width and depth of a phone with respective
 * methods to get the information
 *
 * @author socrates
 */
public class Dimension {
    private double height;
    private double width;
    private double depth;

    public Dimension(double height, double width, double depth) {
        if (height <= 0 || width <= 0 || depth <= 0) {
            throw new IllegalArgumentException(
                    "The height, width, depth of a dimension should be positive"
            );

        }
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    /**
     * Returns the depth of the phone
     * @return depth
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Returns the width of the phone
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Returns the height of the phone
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Returns a string with height, width, depth.
     * in the format
     * "{height} x {width} x {depth}"
     *
     * @see Object#toString()
     */
    @Override
    public String toString() {
        return String.format(
                Locale.ROOT,
                ("%.1f x %.1f x %.1f"),
                height, width, depth
        );
    }
}
