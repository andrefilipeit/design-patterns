package adapter;

import adapter.adapters.SquarePinAdapter;
import adapter.round.RoundHole;
import adapter.round.RoundPin;
import adapter.square.SquarePin;

/**
 * Somewhere in client code...
 */
public class Demo {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundPin rpeg = new RoundPin(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePin smallSqPeg = new SquarePin(2);
        SquarePin largeSqPeg = new SquarePin(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePinAdapter smallSqPegAdapter = new SquarePinAdapter(smallSqPeg);
        SquarePinAdapter largeSqPegAdapter = new SquarePinAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}