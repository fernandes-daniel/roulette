package bet;

import game.Player;
import roulette.Roulette;

public abstract class Bet {
    private Player player;
    private Float amount;

    protected Bet( Player player, Float amount ) {
        this.player = player;
        this.amount = amount;
    }

    abstract public Float getWinAmount( Roulette roulette);

    public Player getPlayer() {
        return player;
    }

    protected Float getAmount() {
        return amount;
    }

    abstract public String getBetAmountType();

    public void settle( Roulette roulette ) {
    }

    public String getBetAmountTypeDisplay() {
        return "";
    }

    public String getOutcomeDisplay() {
        return "";
    }

    public String getWinAmountDisplay() {
        return "";
    }
}