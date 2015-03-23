package bet;

import game.Player;
import roulette.Roulette;

public class NumberBet extends Bet {
    private int betNumber;

    public NumberBet( Player player, Float amount ) {
        super( player, amount );
    }

    @Override
    Float getWinAmount( Roulette roulette ) {
        if ( roulette.getBallNumber() == betNumber ) {
            return 36 * getAmount();
        }
        return ( float ) 0;
    }
}
