package adapter.square;

import adapter.round.RoundHole;

/**
 * SquarePins are not compatible with {@link RoundHole} (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquarePin {
    private double width;

    public SquarePin(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}