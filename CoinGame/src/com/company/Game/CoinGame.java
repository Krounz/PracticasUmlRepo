package com.company.Game;
import java.util.Random;


public class CoinGame {

    Player player1;
    Player player2;
    Coin theCoin;
    public CoinGame(){
    }

    public void startGame(){
        Random rand = new Random();
        if(rand.nextInt()%2 == 1) {
            player1 = new Player("Juan");
            player1.getRandCoinOption();
            player2 = new Player("Pedro");
            player2.setCoinOption(player1.getCoinOption());
        }
        else{
            player2 = new Player("Pedro");
            player2.getRandCoinOption();
            player1 = new Player("Juan");
            player1.setCoinOption(player2.getCoinOption());
        }
        theCoin = new Coin();
        player1.didPlayerWin(theCoin.getCoinOption());
        player2.didPlayerWin(theCoin.getCoinOption());
    }
}
