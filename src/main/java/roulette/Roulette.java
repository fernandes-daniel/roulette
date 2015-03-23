package roulette;

import java.util.Random;

public class Roulette {
    private final Random intGenerator;
    private int ballNumber;

    public Roulette( Random intGenerator ) {
        this.intGenerator = intGenerator;
        spin();
    }

    public void spin() {
        ballNumber = intGenerator.nextInt( 35 ) + 1;
    }

    public int getBallNumber() {
        return ballNumber;
    }

    public boolean getIsBallEven() {
        return ballNumber % 2 == 0;
    }

    public boolean getIsBallOdd() {
        return !getIsBallEven();
    }
}
