import game.Dealer;
import game.SpinTimer;
import input.BetTaker;
import output.ResultsBoard;
import roulette.Roulette;

import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bootstrap {

    public static void main( String[] args ) {
        Roulette roulette = new Roulette( new Random() );

        Dealer dealer = new Dealer( roulette, new ResultsBoard(), new BetTaker() );

        ScheduledExecutorService executor = Executors.newScheduledThreadPool( 1 );
        executor.scheduleAtFixedRate( new SpinTimer( dealer ), 0, 30, TimeUnit.SECONDS );

        dealer.takeBets();

    }
}
