package adapter.adapters;

import adapter.round.RoundPin;
import adapter.square.SquarePin;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class SquarePinAdapter extends RoundPin {
    private SquarePin pin;

    public SquarePinAdapter(SquarePin pin) {
        this.pin = pin;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this pin.
        result = (Math.sqrt(Math.pow((pin.getWidth() / 2), 2) * 2));
        return result;
    }
}