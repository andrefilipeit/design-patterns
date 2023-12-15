package adapter.round;

/**
 * RoundPins are compatible with RoundHoles.
 */
public class RoundPin {
    private double radius;

    public RoundPin() {}

    public RoundPin(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}