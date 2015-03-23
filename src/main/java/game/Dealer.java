package game;

import bet.Bet;
import input.BetTaker;
import output.ResultsBoard;
import roulette.Roulette;

import java.util.List;

public class Dealer {
    private Roulette roulette;
    private final ResultsBoard resultsBoard;
    private final BetTaker betTaker;
    private List<Bet> betList;

    public Dealer( Roulette roulette, ResultsBoard resultsBoard, BetTaker betTaker ) {
        this.roulette = roulette;
        this.resultsBoard = resultsBoard;
        this.betTaker = betTaker;
    }

    public void spinRoulette() {
        synchronized ( betList ) {
            roulette.spin();
            settleAllBets();
            resultsBoard.displayResults(roulette, betList);
            betList.clear();
        }
    }

    private void settleAllBets() {
        for ( Bet bet : betList ) {
            bet.settle( roulette );
        }
    }

    public void takeBets() {
        while ( true ) {
            synchronized ( betList ) {
                betList.add(
                        betTaker.takeBet()
                );

            }
        }
    }

}
