package bet;

import game.Player;
import roulette.Roulette;

public class EvenOddBet extends Bet {
    private boolean even;

    public EvenOddBet( Player player, Float amount ) {
        super( player, amount );
    }

    @Override
    Float getWinAmount( Roulette roulette ) {
        if ( roulette.getIsBallEven() && betIsEven()
                || roulette.getIsBallOdd() && betIsOdd() ) {
            return getAmount() * 2;
        }
        return ( float ) 0;
    }


    public boolean betIsEven() {
        return even;
    }

    public boolean betIsOdd() {
        return !even;
    }

}
