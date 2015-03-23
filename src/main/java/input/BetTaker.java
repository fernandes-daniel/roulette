package input;

import bet.Bet;
import dependency.BetFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BetTaker {
    private final BetFactory betFactory;

    public BetTaker( BetFactory betFactory) {
        this.betFactory = betFactory;
    }

    public Bet takeBet() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter New Bet Line:");
        String betLine = br.readLine();
    }
}
