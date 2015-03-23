package game;

public class SpinTimer implements Runnable{
    final private Dealer dealer;

    public SpinTimer( Dealer dealer ) {
        this.dealer = dealer;
    }

    @Override
    public void run() {
        dealer.spinRoulette();
    }
}
