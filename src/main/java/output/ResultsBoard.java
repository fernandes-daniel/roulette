package output;

import bet.Bet;
import roulette.Roulette;

import java.util.List;

public class ResultsBoard {

    public void displayResults(Roulette roulette, List<Bet> betList ){
        System.out.println( String.format( "Number: %d", roulette.getBallNumber() ) );
        System.out.println( "Player Bet Outcome Winnings" );
        System.out.println( "---" );

        for ( Bet bet : betList ) {
            String playersName = bet.getPlayer().getName();
            String betAmountType = bet.getBetAmountTypeDisplay();
            String outcome = bet.getOutcomeDisplay();
            String winAmount = bet.getWinAmountDisplay();

            System.out.println( String.format( "%s %s %s %s", playersName, betAmountType, outcome, winAmount ) );
        }
    }
}
